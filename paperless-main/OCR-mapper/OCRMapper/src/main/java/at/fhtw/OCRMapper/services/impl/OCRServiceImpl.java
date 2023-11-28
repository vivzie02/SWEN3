package at.fhtw.OCRMapper.services.impl;

import at.fhtw.OCRMapper.OcrMapperApplication;
import at.fhtw.OCRMapper.services.OCRService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.log4j.Logger;

@Service
public class OCRServiceImpl implements OCRService {
    static Logger log = Logger.getLogger(OCRServiceImpl.class.getName());
    @Override
    @RabbitListener(queues = "paperless.documents.queue")
    public void saveDocument(String message){
        if(!message.equals("")) {
            log.info("successfully read info from queue");
        }
    }
}
