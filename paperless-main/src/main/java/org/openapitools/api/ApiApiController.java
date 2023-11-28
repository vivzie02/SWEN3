package org.openapitools.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.minio.PutObjectArgs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openapitools.configuration.MinioConfig.MinioConfig;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.*;
import org.openapitools.persistence.entities.DocumentEntity;
import org.openapitools.services.DocumentService;
import org.openapitools.services.MinioService;
import org.openapitools.services.RabbitMQSenderService;
import org.openapitools.services.mapper.DocumentMapper;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;
import com.fasterxml.jackson.databind.ObjectMapper; // Import ObjectMapper


import javax.annotation.Resource;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
@Controller
@RequestMapping("${openapi.paperlessRestServer.base-path:}")
@CrossOrigin(origins = "http://localhost:8080")
public class ApiApiController implements ApiApi {
    protected static final Logger logger = LogManager.getLogger();

    @Autowired
    private MinioService minioService;

    private final NativeWebRequest request;

    @Autowired
    public ApiApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Autowired
    public DocumentService documentService;

    @Autowired
    private RabbitMQSenderService rabbitMQSenderService;




    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Void> uploadDocument(String title, OffsetDateTime created, Integer documentType, List<Integer> tags, Integer correspondent, List<MultipartFile> document){
        /*
        Document document1 = Document.builder()
                //.id(1)
                .correspondent(JsonNullable.of(2))
                .documentType(JsonNullable.of(3))
                .storagePath(JsonNullable.of(4))
                .title(JsonNullable.of("TestTitle"))
                .content(JsonNullable.of("TestContent"))
                .tags(JsonNullable.of(Arrays.asList(5, 6, 7)))
                //.created(OffsetDateTime.now())
                //.createdDate(OffsetDateTime.now())
                //.modified(OffsetDateTime.now())
                //.added(OffsetDateTime.now())
                .archiveSerialNumber(JsonNullable.of("ASN123"))
                .originalFileName(JsonNullable.of("original.txt"))
                .archivedFileName(JsonNullable.of("archived.txt"))
                .build();
        */

        //nur für einzelne Files
        String originalFileName = document.isEmpty() ? "" : document.get(0).getOriginalFilename();
        String name = document.isEmpty() ? "" : document.get(0).getName();
        String contentType = document.isEmpty() ? "" : document.get(0).getContentType();
        long size = document.isEmpty() ? 0 : document.get(0).getSize();
        //Resource inputStream = (Resource) document.get(0).getResource();


        Document document1 = Document.builder()
                .correspondent(JsonNullable.of(correspondent))
                .documentType(JsonNullable.of(documentType))
                // Der storagePath wird dynamisch während der Dateispeicherung festgelegt
                .storagePath(JsonNullable.of(4))
                .title(JsonNullable.of(name))
                // Der Inhalt kann aus der MultipartFile-Liste extrahiert werden, falls erforderlich
                .content(JsonNullable.of("TestContent"))
                .tags(JsonNullable.of(tags))
                .created(created) // oder OffsetDateTime.now(), falls nicht übergeben
                .createdDate(created)
                //.modified(OffsetDateTime.now())
                //.added(OffsetDateTime.now())
                .archiveSerialNumber(JsonNullable.of(title)) // Setzen Sie dies entsprechend, falls benötigt
                .originalFileName(JsonNullable.of(originalFileName)) // Setzen Sie den Dateinamen der ersten Datei, falls benötigt
                .archivedFileName(JsonNullable.of(title)) // Setzen Sie diesen Wert entsprechend, falls benötigt
                .build();


        documentService.saveDocument(document1);

        // Convert document1 to JSON String
        ObjectMapper mapper = new ObjectMapper();
        try {
            String jsonDocument = mapper.writeValueAsString(document1);
            //rabbitMQSenderService.sendDocumentMessage(jsonDocument);
            rabbitMQSenderService.sendDocumentMessage(originalFileName);
        } catch (JsonProcessingException e) {
            logger.error(e);
        }

        // ab hier:
        //String minioFileName = generateMinioFileName(correspondent, documentType, title);




        try{
            minioService.save(document/*, minioFileName*/);
        }
        catch (Exception ex){
            logger.error(ex);
        }

        return ResponseEntity.ok().build();
    }

    private String generateMinioFileName(Integer correspondent, Integer documentType, String title) {
        // Hier erstellen Sie eine Dateibenennungslogik basierend auf den Attributen
        // Beispiel: correspondent_documentType_title
        return correspondent + "_" + documentType + "_" + title;
    }

}
