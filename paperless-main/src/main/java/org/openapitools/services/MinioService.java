package org.openapitools.services;

import io.minio.GetObjectResponse;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.data.util.Pair;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.InputStream;
import java.util.List;

public interface MinioService {
    public void save(List<MultipartFile> document);
    public Pair<InputStream, String> get(String filename);
}
