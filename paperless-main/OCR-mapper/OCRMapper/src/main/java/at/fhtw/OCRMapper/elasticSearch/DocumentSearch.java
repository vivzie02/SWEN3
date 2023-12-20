package at.fhtw.OCRMapper.elasticSearch;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@org.springframework.data.elasticsearch.annotations.Document(indexName = "document_index")
public class DocumentSearch {
    @Id
    private String id;
    @Field(type = FieldType.Text)
    private String title;
}

