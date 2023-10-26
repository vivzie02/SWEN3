package org.openapitools.services;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.type.OffsetDateTimeType;
import org.openapitools.model.Document;
import org.openapitools.persistence.entities.DocumentEntity;
import org.openapitools.persistence.repositories.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.OffsetDateTime;
import java.util.ArrayList;

@Service
public class DocumentServiceImpl implements DocumentService{
    @Autowired
    DocumentRepository documentRepository;

    @Override
    public void saveDocument(Document document){
        //Map later
        DocumentEntity documentEntity = DocumentEntity.builder()
                .id(1)
                .correspondent(1)
                .documentType(1)
                .storagePath(1)
                .title("Test123")
                .content("cont")
                .tags(new ArrayList<Integer>())
                .build();
        documentRepository.save(documentEntity);
    }
}
