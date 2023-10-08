package org.openapitools;

import org.junit.jupiter.api.Test;
import org.openapitools.services.model.Document;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class OpenApiGeneratorApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    public void testEquals() {
        // Create two documents with the same properties
        Document document1 = new Document()
                .id(1)
                .title("Document Title")
                .content("Document Content");

        Document document2 = new Document()
                .id(1)
                .title("Document Title")
                .content("Document Content");

        // Check if the two documents are equal
        assertEquals(document1, document2);

        // Create another document with different properties
        Document document3 = new Document()
                .id(3)
                .title("Another Title")
                .content("Another Content");

        // Check if it's not equal to the first document
        assertNotEquals(document1, document3);
    }

}