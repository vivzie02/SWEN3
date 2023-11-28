package at.fhtw.OCRmapper;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class OcrService {

    public String extractTextFromFile(File imageFile) {
        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("/pfad/zu/tesseract/data");
        tesseract.setLanguage("deu"); // Für Deutsch, verwenden Sie "eng" für Englisch

        try {
            String text = tesseract.doOCR(imageFile);
            return text;
        } catch (TesseractException e) {
            // Besseres Logging hier
            // Log.error("Fehler bei der Textextraktion", e);
            throw new RuntimeException("Fehler bei der Textextraktion", e);
        }
    }
}
