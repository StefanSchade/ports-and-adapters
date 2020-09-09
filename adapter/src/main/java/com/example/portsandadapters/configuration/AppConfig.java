package com.example.portsandadapters.configuration;

import com.example.portsandadapters.domain.services.OneTwoService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:command.properties")
@RequiredArgsConstructor
public class AppConfig {


    @Bean
    public OneTwoService applicationService() {
        return new OneTwoService();
    }

}
