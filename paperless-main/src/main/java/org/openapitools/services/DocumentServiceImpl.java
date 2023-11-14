package org.openapitools.services;

import org.apache.logging.log4j.LogManager;
import org.openapitools.model.Document;
import org.openapitools.persistence.entities.DocumentEntity;
import org.openapitools.persistence.repositories.DocumentRepository;
import org.openapitools.services.mapper.DocumentMapper;
import org.openapitools.services.mapper.DocumentMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.Logger;


import java.util.ArrayList;

@Service
public class DocumentServiceImpl implements DocumentService{
    @Autowired
    DocumentRepository documentRepository;

    private DocumentMapper documentMapper;

    protected static final Logger logger = LogManager.getLogger();

    @Override
    public void saveDocument(Document document){
        //Map later
        logger.info("saving document to database");
        documentRepository.save(DocumentMapper.INSTANCE.toEntity(document));
    }
}
