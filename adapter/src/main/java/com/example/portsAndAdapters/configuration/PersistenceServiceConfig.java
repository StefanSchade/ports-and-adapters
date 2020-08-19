package com.example.portsAndAdapters.configuration;

import com.example.portsAndAdapters.adapter.out.persistence.map.GenericService;
import com.example.portsAndAdapters.domain.model.aggregate.Sprint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class PersistenceServiceConfig {

    @Bean
    GenericService getPersistenceServiceMap(
            @Lazy @Autowired final GenericPersistenceServiceFactory<Sprint, Long> genericPersistenceServiceFactory) {
        return genericPersistenceServiceFactory.getGenericPersistenceService("map");
    }


}
