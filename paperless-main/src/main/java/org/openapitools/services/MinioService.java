package org.openapitools.services;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface MinioService {
    public void save(List<MultipartFile> document);
}
