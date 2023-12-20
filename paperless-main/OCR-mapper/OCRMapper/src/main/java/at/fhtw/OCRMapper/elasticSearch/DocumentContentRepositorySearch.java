package at.fhtw.OCRMapper.elasticSearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface DocumentContentRepositorySearch extends ElasticsearchRepository<DocumentContentSearch, String> {
}
