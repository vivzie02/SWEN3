package org.openapitools.services.impl;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class RabbitMQSendServiceImplTest {


    @Mock
    private RabbitTemplate rabbitTemplate;

    @InjectMocks
    private RabbitMQSendServiceImpl rabbitMQSenderService;

    @Value("${rabbitmq.exchange}")
    private String testExchange;

    @Value("${rabbitmq.routingkey}")
    private String testRoutingKey;
    @Test
    void sendDocumentMessageToRabbitMQ1() {
        String testMessage = "Test Message 1";
        // Act: Aufruf der zu testenden Methode.
        rabbitMQSenderService.sendDocumentMessage(testMessage);

        // Assert: Überprüfung, ob die Methode die erwarteten Aktionen ausführt.
        // In diesem Fall wird überprüft, ob die Methode `convertAndSend` des `rabbitTemplate`
        // mit den richtigen Parametern aufgerufen wurde.
        verify(rabbitTemplate, times(1)).convertAndSend(testExchange, testRoutingKey, testMessage);
    }
@Test
    void sendDocumentMessageToRabbitMQ2() {
        String testMessage = "Test Message 2";
        // Act: Aufruf der zu testenden Methode.
        rabbitMQSenderService.sendDocumentMessage(testMessage);

        // Assert: Überprüfung, ob die Methode die erwarteten Aktionen ausführt.
        // In diesem Fall wird überprüft, ob die Methode `convertAndSend` des `rabbitTemplate`
        // mit den richtigen Parametern aufgerufen wurde.
        verify(rabbitTemplate, times(1)).convertAndSend(testExchange, testRoutingKey, testMessage);
    }
    @Test
    void sendDocumentMessageToRabbitMQ3() {
        String testMessage = "Test Message 3";
        // Act: Aufruf der zu testenden Methode.
        rabbitMQSenderService.sendDocumentMessage(testMessage);

        // Assert: Überprüfung, ob die Methode die erwarteten Aktionen ausführt.
        // In diesem Fall wird überprüft, ob die Methode `convertAndSend` des `rabbitTemplate`
        // mit den richtigen Parametern aufgerufen wurde.
        verify(rabbitTemplate, times(1)).convertAndSend(testExchange, testRoutingKey, testMessage);
    }
    @Test
    void sendDocumentMessageToRabbitMQ4() {
        String testMessage = "Test Message 4";
        // Act: Aufruf der zu testenden Methode.
        rabbitMQSenderService.sendDocumentMessage(testMessage);

        // Assert: Überprüfung, ob die Methode die erwarteten Aktionen ausführt.
        // In diesem Fall wird überprüft, ob die Methode `convertAndSend` des `rabbitTemplate`
        // mit den richtigen Parametern aufgerufen wurde.
        verify(rabbitTemplate, times(1)).convertAndSend(testExchange, testRoutingKey, testMessage);
    }
    @Test
    void sendDocumentMessageToRabbitMQ5() {
        String testMessage = "Test Message 5";
        // Act: Aufruf der zu testenden Methode.
        rabbitMQSenderService.sendDocumentMessage(testMessage);

        // Assert: Überprüfung, ob die Methode die erwarteten Aktionen ausführt.
        // In diesem Fall wird überprüft, ob die Methode `convertAndSend` des `rabbitTemplate`
        // mit den richtigen Parametern aufgerufen wurde.
        verify(rabbitTemplate, times(1)).convertAndSend(testExchange, testRoutingKey, testMessage);
    }
}