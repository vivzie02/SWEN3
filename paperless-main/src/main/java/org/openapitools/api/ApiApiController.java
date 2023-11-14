package org.openapitools.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.*;
import org.openapitools.services.DocumentService;
import org.openapitools.services.RabbitMQSenderService;
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
        //Document document1 = new Document();
        Document document1 = Document.builder()
                .id(1)
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

        documentService.saveDocument(document1);

        // Convert document1 to JSON String
        ObjectMapper mapper = new ObjectMapper();
        try {
            String jsonDocument = mapper.writeValueAsString(document1);
            rabbitMQSenderService.sendDocumentMessage(jsonDocument);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            // Handle the exception (e.g., return an error response)
        }

        return ResponseEntity.ok().build();
    }

}
