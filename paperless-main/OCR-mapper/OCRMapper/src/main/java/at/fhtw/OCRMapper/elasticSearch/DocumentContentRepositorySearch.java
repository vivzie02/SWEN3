package at.fhtw.OCRMapper.elasticSearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface DocumentContentRepositorySearch extends ElasticsearchRepository<DocumentContentSearch, String> {
}
