package com.example.portsAndAdapters.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class  PersistenceConfig {

    @Bean
    MapRepoFactoryBacklogItem getBacklogItemMapRepoFactory() {
        return new MapRepoFactoryBacklogItem();
    }




}
