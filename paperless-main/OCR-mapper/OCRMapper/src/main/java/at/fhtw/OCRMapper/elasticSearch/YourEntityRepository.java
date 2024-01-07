package at.fhtw.OCRMapper.elasticSearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface YourEntityRepository extends ElasticsearchRepository<YourEntity, String> {
    // Custom query methods if needed
    Optional<YourEntity> findById(String id);
}
