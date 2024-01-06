package at.fhtw.OCRMapper.elasticSearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface DocumentRepositorySearch extends ElasticsearchRepository<DocumentSearch, String> {
}
