package at.fhtw.OCRmapper;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@Service
public class OcrService {

    public String extractTextFromPdf(File pdfFile) {
        Tesseract tesseract = new Tesseract();
        //tesseract.setDatapath("C:\\Program Files\\Tesseract-OCR\\tessdata");
        //tesseract.setLanguage("eng");

        StringBuilder extractedText = new StringBuilder();

        try (PDDocument document = PDDocument.load(pdfFile)) {
            PDFRenderer renderer = new PDFRenderer(document);
            for (int page = 0; page < document.getNumberOfPages(); ++page) {
                BufferedImage image = renderer.renderImageWithDPI(page, 300);
                try {
                    String text = tesseract.doOCR(image);
                    extractedText.append(text).append("\n");
                } catch (TesseractException e) {
                    // Besseres Logging hier
                    // Log.error("Fehler bei der Textextraktion der Seite " + page, e);
                    continue; // oder anderes Fehlerbehandlungsverhalten
                }
            }
        } catch (IOException e) {
            // Log.error("Fehler beim Laden des PDF-Dokuments", e);
            throw new RuntimeException("Fehler beim Laden des PDF-Dokuments", e);
        }

        return extractedText.toString();
    }
}
