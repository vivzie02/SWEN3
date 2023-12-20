package at.fhtw.OCRMapper.elasticSearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface DocumentRepositorySearch extends ElasticsearchRepository<DocumentSearch, String> {
}
