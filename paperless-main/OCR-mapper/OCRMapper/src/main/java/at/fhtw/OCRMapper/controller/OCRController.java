package at.fhtw.OCRMapper.controller;

import at.fhtw.OCRMapper.services.OCRService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OCRController {
    @Autowired
    OCRService ocrService;

    @RabbitListener(queues = "paperless.documents.queue")
    public void readQueue(String message) {
        ocrService.saveDocument(message);
    }
}
