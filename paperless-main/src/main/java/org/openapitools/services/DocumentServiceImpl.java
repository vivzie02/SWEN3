package org.openapitools.services;

import org.apache.logging.log4j.LogManager;
import org.openapitools.model.Document;
import org.openapitools.persistence.entities.DocumentEntity;
import org.openapitools.persistence.repositories.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.Logger;


import java.util.ArrayList;

@Service
public class DocumentServiceImpl implements DocumentService{
    @Autowired
    DocumentRepository documentRepository;

    protected static final Logger logger = LogManager.getLogger();

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
                .tags(new ArrayList<>())
                .build();

        logger.info("saving document to database");
        documentRepository.save(documentEntity);


    }
}
