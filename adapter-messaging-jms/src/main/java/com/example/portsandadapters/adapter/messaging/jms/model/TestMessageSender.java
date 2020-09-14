package com.example.portsandadapters.adapter.messaging.jms.model;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.jms.core.JmsTemplate;

import java.util.UUID;

@RequiredArgsConstructor
public class TestMessageSender {

    private final JmsTemplate jmsTemplate;

    @Scheduled(fixedRate = 2000)
    public void sendMessage() {

        HelloWorldMessage message = HelloWorldMessage
                .builder()
                .id(UUID.randomUUID())
                .message("Hello World!")
                .build();

        jmsTemplate.convertAndSend(HelloWorldMessage.TEST_QUEUE, message);

        System.out.println("Message Sent!");

    }


}
