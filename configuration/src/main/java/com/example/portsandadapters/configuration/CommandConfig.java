package com.example.portsandadapters.configuration;

import com.example.portsandadapters.application.services.command.sprint.uc001.UC001Service;
import com.example.portsandadapters.domain.model.one.GenericAggregateRoot001;
import com.example.portsandadapters.domain.model.two.GenericAggregateRoot002;
import com.example.portsandadapters.port.repository.PersistenceAbstraction;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:wsprovider.properties")
@RequiredArgsConstructor
public class CommandConfig {

    @NonNull private PersistenceAbstraction<GenericAggregateRoot001, Long> ag001Repo;

    @NonNull private PersistenceAbstraction<GenericAggregateRoot002, Long> ag002Repo;

    @Bean
    public UC001Service Ag001_Com001_LongName_Service() {
        return new UC001Service(ag001Repo, ag002Repo);
    }


}
