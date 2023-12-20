package at.fhtw.OCRMapper.elasticSearch;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@Document(indexName = "your_index")
public class YourEntity {
    @Id
    private String id;

    @Field(type = FieldType.Text)
    private String myMsg;

    // Getters and setters
}
