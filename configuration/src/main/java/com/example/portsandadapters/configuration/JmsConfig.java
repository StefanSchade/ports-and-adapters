package com.example.portsandadapters.configuration;

import com.example.portsandadapters.adapter.messaging.jms.model.TestMessageListener;
import com.example.portsandadapters.adapter.messaging.jms.model.TestMessageSender;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

@Configuration
@RequiredArgsConstructor
public class JmsConfig {

    @Bean
    public MessageConverter messageConverter() {

        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("_type");
        return converter;
    }

    @Bean
    TestMessageSender TestMessageSender(JmsTemplate jmsTemplate) {
        return new TestMessageSender(jmsTemplate);
    }


    @Bean
    TestMessageListener TestMessageListener() {
        return new TestMessageListener();
    }


}
