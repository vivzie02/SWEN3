/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.services.model.Correspondent;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.services.model.DocTag;
import org.openapitools.services.model.Document;
import org.openapitools.services.model.DocumentType;
import org.openapitools.services.model.NewCorrespondent;
import org.openapitools.services.model.NewDocumentType;
import org.openapitools.services.model.NewTag;
import java.time.OffsetDateTime;
import org.openapitools.services.model.UserInfo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-02T15:01:24.511843Z[Etc/UTC]")
@Validated
@Tag(name = "Login", description = "the Login API")
public interface ApiApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /api
     *
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "apiGet",
        tags = { "Login" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api"
    )
    default ResponseEntity<Void> apiGet(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/search/autocomplete
     *
     * @param term  (optional)
     * @param limit  (optional)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "autoComplete",
        tags = { "Search" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/search/autocomplete"
    )
    default ResponseEntity<Void> autoComplete(
        @Parameter(name = "term", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "term", required = false) String term,
        @Parameter(name = "limit", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "limit", required = false) Integer limit
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /api/correspondents
     *
     * @param newCorrespondent  (optional)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "createCorrespondent",
        tags = { "Correspondents" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/correspondents",
        consumes = { "application/json", "text/json", "application/*+json" }
    )
    default ResponseEntity<Void> createCorrespondent(
        @Parameter(name = "NewCorrespondent", description = "") @Valid @RequestBody(required = false) NewCorrespondent newCorrespondent
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /api/document_types
     *
     * @param newDocumentType  (optional)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "createDocumentType",
        tags = { "DocumentTypes" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/document_types",
        consumes = { "application/json", "text/json", "application/*+json" }
    )
    default ResponseEntity<Void> createDocumentType(
        @Parameter(name = "NewDocumentType", description = "") @Valid @RequestBody(required = false) NewDocumentType newDocumentType
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /api/tags
     *
     * @param newTag  (optional)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "createTag",
        tags = { "Tags" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/tags",
        consumes = { "application/json", "text/json", "application/*+json" }
    )
    default ResponseEntity<Void> createTag(
        @Parameter(name = "NewTag", description = "") @Valid @RequestBody(required = false) NewTag newTag
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /api/correspondents/{id}
     *
     * @param id  (required)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "deleteCorrespondent",
        tags = { "Correspondents" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/correspondents/{id}"
    )
    default ResponseEntity<Void> deleteCorrespondent(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /api/documents/{id}
     *
     * @param id  (required)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "deleteDocument",
        tags = { "Documents" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/documents/{id}"
    )
    default ResponseEntity<Void> deleteDocument(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /api/document_types/{id}
     *
     * @param id  (required)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "deleteDocumentType",
        tags = { "DocumentTypes" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/document_types/{id}"
    )
    default ResponseEntity<Void> deleteDocumentType(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /api/tags/{id}
     *
     * @param id  (required)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "deleteTag",
        tags = { "Tags" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/tags/{id}"
    )
    default ResponseEntity<Void> deleteTag(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/documents/{id}/download
     *
     * @param id  (required)
     * @param original  (optional)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "downloadDocument",
        tags = { "Documents" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/documents/{id}/download"
    )
    default ResponseEntity<Void> downloadDocument(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id,
        @Parameter(name = "original", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "original", required = false) Boolean original
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/correspondents
     *
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "getCorrespondents",
        tags = { "Correspondents" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/correspondents"
    )
    default ResponseEntity<Void> getCorrespondents(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/documents/{id}/metadata
     *
     * @param id  (required)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "getDocumentMetadata",
        tags = { "Documents" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/documents/{id}/metadata"
    )
    default ResponseEntity<Void> getDocumentMetadata(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/documents/{id}/preview
     *
     * @param id  (required)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "getDocumentPreview",
        tags = { "Documents" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/documents/{id}/preview"
    )
    default ResponseEntity<Void> getDocumentPreview(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/documents/{id}/thumb
     *
     * @param id  (required)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "getDocumentThumb",
        tags = { "Documents" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/documents/{id}/thumb"
    )
    default ResponseEntity<Void> getDocumentThumb(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/document_types
     *
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "getDocumentTypes",
        tags = { "DocumentTypes" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/document_types"
    )
    default ResponseEntity<Void> getDocumentTypes(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/documents
     *
     * @param page  (optional)
     * @param pageSize  (optional)
     * @param query  (optional)
     * @param ordering  (optional)
     * @param tagsIdAll  (optional)
     * @param documentTypeId  (optional)
     * @param correspondentId  (optional)
     * @param truncateContent  (optional)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "getDocuments",
        tags = { "Documents" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/documents"
    )
    default ResponseEntity<Void> getDocuments(
        @Parameter(name = "Page", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "Page", required = false) Integer page,
        @Parameter(name = "page_size", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "page_size", required = false) Integer pageSize,
        @Parameter(name = "query", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "query", required = false) String query,
        @Parameter(name = "ordering", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "ordering", required = false) String ordering,
        @Parameter(name = "tags__id__all", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "tags__id__all", required = false) List<Integer> tagsIdAll,
        @Parameter(name = "document_type__id", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "document_type__id", required = false) Integer documentTypeId,
        @Parameter(name = "correspondent__id", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "correspondent__id", required = false) Integer correspondentId,
        @Parameter(name = "truncate_content", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "truncate_content", required = false) Boolean truncateContent
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/tags
     *
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "getTags",
        tags = { "Tags" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/tags"
    )
    default ResponseEntity<Void> getTags(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /api/token
     *
     * @param userInfo  (optional)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "getToken",
        tags = { "Login" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/token",
        consumes = { "application/json", "text/json", "application/*+json" }
    )
    default ResponseEntity<Void> getToken(
        @Parameter(name = "UserInfo", description = "") @Valid @RequestBody(required = false) UserInfo userInfo
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /api
     *
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "root",
        tags = { "Login" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api"
    )
    default ResponseEntity<Void> root(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/statistics
     *
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "statistics",
        tags = { "Login" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/statistics"
    )
    default ResponseEntity<Void> statistics(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /api/correspondents/{id}
     *
     * @param id  (required)
     * @param correspondent  (optional)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "updateCorrespondent",
        tags = { "Correspondents" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/correspondents/{id}",
        consumes = { "application/json", "text/json", "application/*+json" }
    )
    default ResponseEntity<Void> updateCorrespondent(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id,
        @Parameter(name = "Correspondent", description = "") @Valid @RequestBody(required = false) Correspondent correspondent
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /api/documents/{id}
     *
     * @param id  (required)
     * @param document  (optional)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "updateDocument",
        tags = { "Documents" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/documents/{id}",
        consumes = { "application/json", "text/json", "application/*+json" }
    )
    default ResponseEntity<Void> updateDocument(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id,
        @Parameter(name = "Document", description = "") @Valid @RequestBody(required = false) Document document
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /api/document_types/{id}
     *
     * @param id  (required)
     * @param documentType  (optional)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "updateDocumentType",
        tags = { "DocumentTypes" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/document_types/{id}",
        consumes = { "application/json", "text/json", "application/*+json" }
    )
    default ResponseEntity<Void> updateDocumentType(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id,
        @Parameter(name = "DocumentType", description = "") @Valid @RequestBody(required = false) DocumentType documentType
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /api/tags/{id}
     *
     * @param id  (required)
     * @param docTag  (optional)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "updateTag",
        tags = { "Tags" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/tags/{id}",
        consumes = { "application/json", "text/json", "application/*+json" }
    )
    default ResponseEntity<Void> updateTag(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id,
        @Parameter(name = "DocTag", description = "") @Valid @RequestBody(required = false) DocTag docTag
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /api/documents/post_document
     *
     * @param title  (optional)
     * @param created  (optional)
     * @param documentType  (optional)
     * @param tags  (optional)
     * @param correspondent  (optional)
     * @param document  (optional)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "uploadDocument",
        tags = { "Documents" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/documents/post_document",
        consumes = { "multipart/form-data" }
    )
    default ResponseEntity<Void> uploadDocument(
        @Parameter(name = "title", description = "") @Valid @RequestParam(value = "title", required = false) String title,
        @Parameter(name = "created", description = "") @Valid @RequestParam(value = "created", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime created,
        @Parameter(name = "document_type", description = "") @Valid @RequestParam(value = "document_type", required = false) Integer documentType,
        @Parameter(name = "tags", description = "") @Valid @RequestPart(value = "tags", required = false) List<Integer> tags,
        @Parameter(name = "correspondent", description = "") @Valid @RequestParam(value = "correspondent", required = false) Integer correspondent,
        @Parameter(name = "document", description = "") @RequestPart(value = "document", required = false) List<MultipartFile> document
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
