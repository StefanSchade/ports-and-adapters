package com.example.portsandadapters.configuration;

import com.example.portsandadapters.adapter.out.persistence.jpa.SprintJPAService;
import com.example.portsandadapters.application.port.out.persistence.PersistenceAbstraction;
import com.example.portsandadapters.domain.model.aggregate.sprint.Sprint;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:persistence.properties")
@RequiredArgsConstructor
public class PersistenceConfig {

    @Bean
    @ConditionalOnProperty(value = "adaptertype", havingValue = "jpa")
    public SprintJPAService JPAServiceSprintAggregate() {
        return new SprintJPAService();
    }

    @Bean
    @ConditionalOnProperty(value = "adaptertype", havingValue = "map")
    public MapAdapterFactory GenericMapServiceFactory() {
        return new MapAdapterFactory();
    }

    @Bean
    @ConditionalOnProperty(value = "adaptertype", havingValue = "map")
    public PersistenceAbstraction<Sprint, Long> mapRepoSprint(MapAdapterFactory factory) {
        return factory.createMapRepo();
    }
}