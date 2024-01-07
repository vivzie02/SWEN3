package org.openapitools.services;

import org.springframework.data.util.Pair;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;

public interface MinioService {
    public void save(List<MultipartFile> document);
    public Pair<InputStream, String> get(String filename);
}
