package at.fhtw.OCRMapper.elasticSearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.Optional;

public interface YourEntityRepository extends ElasticsearchRepository<YourEntity, String> {
    // Custom query methods if needed
    Optional<YourEntity> findById(String id);
}
