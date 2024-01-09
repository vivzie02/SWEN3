package at.fhtw.OCRMapper.controller;

import at.fhtw.OCRMapper.services.OCRService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OCRController {
    protected static final Logger log = LogManager.getLogger();
    @Autowired
    OCRService ocrService;

    @RabbitListener(queues = "paperless.documents.queue")
    public void readQueue(String message) {
        log.info("Message read from RabbitMQ");
        ocrService.saveDocument(message);
    }
}
