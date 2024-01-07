package at.fhtw.OCRMapper.elasticSearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//@RestController
//@RequestMapping("/api")
@Service
public class YourEntityController {



    @Autowired
    private DocumentRepositorySearch documentRepository;



    public String createDocument(Long id, String title, String content) {
        final Logger log = LogManager.getLogger();
        DocumentSearch document = new DocumentSearch();
        document.setId(String.valueOf(id));
        document.setTitle(title);
        document.setContent(content);
        String toS = "";
        try {
            DocumentSearch savedDocument = documentRepository.save(document);
            toS = savedDocument.toString();
            log.info("Saved document: " + savedDocument);
        } catch (Exception e) {
            log.error("Error saving document: " + e.getMessage());
            e.printStackTrace();
        }

        return toS;
    }

}
