package com.example.portsAndAdapters.configuration;

import com.example.portsAndAdapters.adapter.out.persistence.map.MapRepoBacklogItem;
import com.example.portsAndAdapters.adapter.out.persistence.map.MapRepoSprint;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BacklogItemRepoFactory {

    public MapRepoBacklogItem createBacklogItemMapRepo(String configuration){
        return new MapRepoBacklogItem();
    }

    public MapRepoSprint createSprintMapRepo(String map) {
        return new MapRepoSprint();
    }
}
