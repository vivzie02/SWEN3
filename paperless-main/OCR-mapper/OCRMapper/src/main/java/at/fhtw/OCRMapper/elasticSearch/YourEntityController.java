package at.fhtw.OCRMapper.elasticSearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

//@RestController
//@RequestMapping("/api")
@Service
public class YourEntityController {

    @Autowired
    private YourEntityRepository repository;

    @Autowired
    private DocumentRepositorySearch documentRepository;
    @Autowired
    private DocumentContentRepositorySearch documentContentRepository;
    public Optional<YourEntity> getEntityById(String id) {
        return repository.findById(id);
    }

    //@PostMapping("/entities")
    //@ResponseStatus(HttpStatus.CREATED)
    public String createDocument(Long id, String title ) {
        DocumentSearch document = new DocumentSearch();
        document.setId(String.valueOf(id));
        document.setTitle(title);
        String toS = "";
        try {
            DocumentSearch savedDocument = documentRepository.save(document);
            toS = savedDocument.toString();
            System.out.println("Saved document: " + savedDocument);
        } catch (Exception e) {
            System.out.println("Error saving document: " + e.getMessage());
            e.printStackTrace();
        }

        return toS;
    }

}
