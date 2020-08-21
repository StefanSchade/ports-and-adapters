package com.example.portsandadapters.configuration;

import com.example.portsandadapters.application.port.out.persistence.PersistenceAbstraction;
import com.example.portsandadapters.domain.model.aggregate.Sprint.BacklogItem;
import com.example.portsandadapters.domain.model.aggregate.Sprint.Sprint;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:persistence.properties")
public class PersistenceConfig {

    @Bean
    public GenericRepoFactory mapRepoFactoryBacklogItem() {
        return new GenericRepoFactory();
    }

    @Bean
    @ConditionalOnProperty(value = "adaptertype", havingValue = "map", matchIfMissing = false)
    public PersistenceAbstraction<BacklogItem, Long> createMapRepoBacklogItem(GenericRepoFactory factory) {
        return factory.createMapRepo("map");
    }

    @Bean
    @ConditionalOnProperty(value = "adaptertype", havingValue = "map", matchIfMissing = false)
    public PersistenceAbstraction<Sprint, Long> createMapRepoSprint(GenericRepoFactory factory) {
        return factory.createMapRepo("map");
    }



}
