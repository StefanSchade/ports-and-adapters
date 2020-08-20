package com.example.portsAndAdapters.configuration;

import com.example.portsAndAdapters.adapter.out.persistence.map.MapRepoBacklogItem;
import com.example.portsAndAdapters.adapter.out.persistence.map.MapRepoSprint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class PersistenceConfig {

    @Bean
    public BacklogItemRepoFactory mapRepoFactoryBacklogItem() {
        return new BacklogItemRepoFactory();
    }

    @Bean
    @Profile({"default", "map"})
    public MapRepoBacklogItem createMapRepoBacklogItem(BacklogItemRepoFactory factory){
        return factory.createBacklogItemMapRepo("map");
    }

    @Bean
    @Profile({"default", "map"})
    public MapRepoSprint createMapRepoSprint(BacklogItemRepoFactory factory){
        return factory.createSprintMapRepo("map");
    }




}
