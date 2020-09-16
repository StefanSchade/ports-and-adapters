package com.example.portsandadapters.adapter.messaging.jms.model;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
public class TestMessageSender {

    private final JmsTemplate jmsTemplate;

    @Scheduled(fixedRate = 5000)
    public void sendMessage() {

        HelloWorldMessage message = HelloWorldMessage
                .builder()
                .id(UUID.randomUUID())
                .message("Hello World!")
                .build();

        jmsTemplate.convertAndSend(HelloWorldMessage.TEST_QUEUE, message);

        log.info("Message Sent!");
    }
}
