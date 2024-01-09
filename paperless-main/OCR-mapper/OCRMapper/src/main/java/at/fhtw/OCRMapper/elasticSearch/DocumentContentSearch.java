package at.fhtw.OCRMapper.elasticSearch;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@Document(indexName = "documentcontent_index")
public class DocumentContentSearch {
    @Id
    private String documentId;
    @Field(type = FieldType.Text)
    private String line;
}
