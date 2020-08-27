package com.example.portsandadapters.configuration;

import com.example.portsandadapters.application.port.out.persistence.PersistenceAbstraction;
import com.example.portsandadapters.application.services.command.sprint.uc001.UC001Service;
import com.example.portsandadapters.domain.model.aggregate.sprint.Sprint;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:command.properties")
@RequiredArgsConstructor
public class CommandConfig {

    @NonNull private PersistenceAbstraction<Sprint, Long> ag001Repo;

    @Bean
    public UC001Service Ag001_Com001_LongName_Service() {
        return new UC001Service(ag001Repo);
    }



}
