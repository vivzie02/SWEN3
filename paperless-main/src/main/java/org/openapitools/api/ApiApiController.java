package org.openapitools.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.minio.PutObjectArgs;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.elasticsearch.client.core.MainResponse;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.openapitools.configuration.MinioConfig.MinioConfig;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.*;
import org.openapitools.services.DocumentService;
import org.openapitools.services.MinioService;
import org.openapitools.services.RabbitMQSenderService;
import org.springframework.core.io.InputStreamResource;
import org.springframework.data.util.Pair;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.InputStream;
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

import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.RestClient;
import org.apache.http.HttpHost;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.client.RequestOptions;

import java.io.IOException;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.*;
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
/*
    @Override
    public ResponseEntity<GetDocuments200Response> getDocuments(
            @Parameter(name = "Page", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "Page", required = false) Integer page,
            @Parameter(name = "page_size", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "page_size", required = false) Integer pageSize,
            @Parameter(name = "query", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "query", required = false) String query,
            @Parameter(name = "ordering", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "ordering", required = false) String ordering,
            @Parameter(name = "tags__id__all", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "tags__id__all", required = false) List<Integer> tagsIdAll,
            @Parameter(name = "document_type__id", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "document_type__id", required = false) Integer documentTypeId,
            @Parameter(name = "storage_path__id__in", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "storage_path__id__in", required = false) Integer storagePathIdIn,
            @Parameter(name = "correspondent__id", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "correspondent__id", required = false) Integer correspondentId,
            @Parameter(name = "truncate_content", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "truncate_content", required = false) Boolean truncateContent
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"next\" : 6, \"all\" : [ 5, 5 ], \"previous\" : 1, \"count\" : 0, \"results\" : [ { \"owner\" : 4, \"user_can_change\" : true, \"archive_serial_number\" : 2, \"notes\" : [ { \"note\" : \"note\", \"created\" : \"created\", \"document\" : 1, \"id\" : 7, \"user\" : 1 }, { \"note\" : \"note\", \"created\" : \"created\", \"document\" : 1, \"id\" : 7, \"user\" : 1 } ], \"added\" : \"added\", \"created\" : \"created\", \"title\" : \"title\", \"content\" : \"content\", \"tags\" : [ 3, 3 ], \"storage_path\" : 9, \"archived_file_name\" : \"archived_file_name\", \"modified\" : \"modified\", \"correspondent\" : 2, \"original_file_name\" : \"original_file_name\", \"id\" : 5, \"created_date\" : \"created_date\", \"document_type\" : 7 }, { \"owner\" : 4, \"user_can_change\" : true, \"archive_serial_number\" : 2, \"notes\" : [ { \"note\" : \"note\", \"created\" : \"created\", \"document\" : 1, \"id\" : 7, \"user\" : 1 }, { \"note\" : \"note\", \"created\" : \"created\", \"document\" : 1, \"id\" : 7, \"user\" : 1 } ], \"added\" : \"added\", \"created\" : \"created\", \"title\" : \"title\", \"content\" : \"content\", \"tags\" : [ 3, 3 ], \"storage_path\" : 9, \"archived_file_name\" : \"archived_file_name\", \"modified\" : \"modified\", \"correspondent\" : 2, \"original_file_name\" : \"original_file_name\", \"id\" : 5, \"created_date\" : \"created_date\", \"document_type\" : 7 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        System.out.println("yess");
        System.out.println("-> " + query);
        return new ResponseEntity<>(HttpStatus.OK);

    }*/
    @Override
    //public ResponseEntity<GetDocuments200Response> getDocuments(
    public ResponseEntity<?> getDocuments(
            @Parameter(name = "Page", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "Page", required = false) Integer page,
            @Parameter(name = "page_size", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "page_size", required = false) Integer pageSize,
            @Parameter(name = "query", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "query", required = false) String query,
            @Parameter(name = "ordering", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "ordering", required = false) String ordering,
            @Parameter(name = "tags__id__all", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "tags__id__all", required = false) List<Integer> tagsIdAll,
            @Parameter(name = "document_type__id", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "document_type__id", required = false) Integer documentTypeId,
            @Parameter(name = "storage_path__id__in", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "storage_path__id__in", required = false) Integer storagePathIdIn,
            @Parameter(name = "correspondent__id", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "correspondent__id", required = false) Integer correspondentId,
            @Parameter(name = "truncate_content", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "truncate_content", required = false) Boolean truncateContent
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"next\" : 6, \"all\" : [ 5, 5 ], \"previous\" : 1, \"count\" : 0, \"results\" : [ { \"owner\" : 4, \"user_can_change\" : true, \"archive_serial_number\" : 2, \"notes\" : [ { \"note\" : \"note\", \"created\" : \"created\", \"document\" : 1, \"id\" : 7, \"user\" : 1 }, { \"note\" : \"note\", \"created\" : \"created\", \"document\" : 1, \"id\" : 7, \"user\" : 1 } ], \"added\" : \"added\", \"created\" : \"created\", \"title\" : \"title\", \"content\" : \"content\", \"tags\" : [ 3, 3 ], \"storage_path\" : 9, \"archived_file_name\" : \"archived_file_name\", \"modified\" : \"modified\", \"correspondent\" : 2, \"original_file_name\" : \"original_file_name\", \"id\" : 5, \"created_date\" : \"created_date\", \"document_type\" : 7 }, { \"owner\" : 4, \"user_can_change\" : true, \"archive_serial_number\" : 2, \"notes\" : [ { \"note\" : \"note\", \"created\" : \"created\", \"document\" : 1, \"id\" : 7, \"user\" : 1 }, { \"note\" : \"note\", \"created\" : \"created\", \"document\" : 1, \"id\" : 7, \"user\" : 1 } ], \"added\" : \"added\", \"created\" : \"created\", \"title\" : \"title\", \"content\" : \"content\", \"tags\" : [ 3, 3 ], \"storage_path\" : 9, \"archived_file_name\" : \"archived_file_name\", \"modified\" : \"modified\", \"correspondent\" : 2, \"original_file_name\" : \"original_file_name\", \"id\" : 5, \"created_date\" : \"created_date\", \"document_type\" : 7 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        System.out.println("yess");
        System.out.println("-> " + query);
        List<String> titles = new ArrayList<>();
/*
        try (RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost", 9200, "http")))) {*/
        String titleTest = "";
        try (RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(new HttpHost("host.docker.internal", 9200, "http")))) {

            SearchRequest searchRequest = new SearchRequest("document_index");
            SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

            BoolQueryBuilder boolQuery = QueryBuilders.boolQuery();
            boolQuery.should(QueryBuilders.matchQuery("title", query));
            boolQuery.should(QueryBuilders.matchQuery("content", query));

            searchSourceBuilder.query(boolQuery);
            searchRequest.source(searchSourceBuilder);

            SearchResponse searchResponse = client.search(searchRequest, RequestOptions.DEFAULT);

            for (SearchHit hit : searchResponse.getHits().getHits()) {
                // Get the source of the hit as a Map
                Map<String, Object> sourceAsMap = hit.getSourceAsMap();

                // Extract and print the title field
                String title = (String) sourceAsMap.get("title");
                System.out.println("Title: " + title);
                titles.add(title);
                titleTest = title;
            }
            System.out.println("im in");
        } catch (IOException e) {
            System.out.println("failed -->");
            e.printStackTrace();
        }

        try {
            //LOGGING
            logger.info("--- GET FILE ---: " + titleTest);

            Pair<String, String> fileData = minioService.get(titleTest);
            if (fileData == null || fileData.getFirst() == null) {
                System.out.println("--> " + fileData + " ");
                return ResponseEntity.notFound().build();
            }

            String fileStream = fileData.getFirst();
            String contentType = fileData.getSecond();

            //InputStreamResource resource = new InputStreamResource(fileStream);

            return ResponseEntity.ok().body(fileData.toString());/*
                    .contentType(MediaType.parseMediaType(contentType))
                    .body(resource);*/
        } catch (Exception e) {
            //LOGGING
            logger.error("Error occurred while fetching file: " + titleTest, e);
            return ResponseEntity.internalServerError().body("Error occurred: " + e.getMessage());
        }

        //return new ResponseEntity<>(titles, HttpStatus.OK);
       // return new ResponseEntity<>( HttpStatus.OK);

    }
/*
    public ResponseEntity<?> getFile(@PathVariable String filename) {
        try {
            //LOGGING
            logger.info("--- GET FILE ---: " + filename);

            Pair<InputStream, String> fileData = minioService.get(filename);
            if (fileData == null || fileData.getFirst() == null) {
                return ResponseEntity.notFound().build();
            }

            InputStream fileStream = fileData.getFirst();
            String contentType = fileData.getSecond();

            InputStreamResource resource = new InputStreamResource(fileStream);

            return ResponseEntity.ok()
                    .contentType(MediaType.parseMediaType(contentType))
                    .body(resource);
        } catch (Exception e) {
            //LOGGING
            logger.error("Error occurred while fetching file: " + filename, e);
            return ResponseEntity.internalServerError().body("Error occurred: " + e.getMessage());
        }
    }*/


    @Override
    public ResponseEntity<Void> uploadDocument(String title, OffsetDateTime created, Integer documentType, List<Integer> tags, Integer correspondent, List<MultipartFile> document){
        //Document document1 = new Document();
        Document document1 = Document.builder()
                .id(5)
                .correspondent(JsonNullable.of(2))
                .documentType(JsonNullable.of(3))
                .storagePath(JsonNullable.of(4))
                .title(JsonNullable.of("title"))
                .content(JsonNullable.of("TestContent"))
                .tags(JsonNullable.of(Arrays.asList(5, 6, 7)))
                //.created(OffsetDateTime.now())
                //.createdDate(OffsetDateTime.now())
                //.modified(OffsetDateTime.now())
                //.added(OffsetDateTime.now())
                .archiveSerialNumber(JsonNullable.of("ASN123"))
                .originalFileName(document.get(0).getOriginalFilename())
                .archivedFileName(JsonNullable.of("archived.txt"))
                .build();

        documentService.saveDocument(document1);

        // Convert document1 to JSON String
        ObjectMapper mapper = new ObjectMapper();
        try {
            String jsonDocument = mapper.writeValueAsString(document1);
            logger.info(jsonDocument);
            rabbitMQSenderService.sendDocumentMessage(jsonDocument);
        } catch (JsonProcessingException e) {
            logger.error(e);
        }

        try{
            minioService.save(document);
        }
        catch (Exception ex){
            logger.error(ex);
        }

        return ResponseEntity.ok().build();
    }

}
