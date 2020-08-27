package com.example.portsandadapters.configuration;

import com.example.portsandadapters.adapter.out.persistence.jpa.JPAServiceSprintAggregate;
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
    @ConditionalOnProperty(value = "adaptertype", havingValue = "jpa", matchIfMissing = false)
    public JPAServiceSprintAggregate JPAServiceSprintAggregate() {
        return new JPAServiceSprintAggregate();
    }

    @Bean
    @ConditionalOnProperty(value = "adaptertype", havingValue = "map", matchIfMissing = false)
    public MapAdapterFactory GenericMapServiceFactory() {
        return new MapAdapterFactory();
    }

    @Bean
    @ConditionalOnProperty(value = "adaptertype", havingValue = "map", matchIfMissing = false)
    public PersistenceAbstraction<Sprint, Long> mapRepoSprint(MapAdapterFactory factory) {
        return factory.createMapRepo();
    }
}