package com.example.portsandadapters.adapter.messaging.jms.model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.Message;

@Slf4j
@Component
public class TestMessageListener {

    @JmsListener(destination = HelloWorldMessage.TEST_QUEUE)
    public void listen(@Payload HelloWorldMessage helloWorldMessage,
                       @Headers MessageHeaders headers, Message message) {

        log.info("I Got a Message!!!!! {}", helloWorldMessage);
    }
}