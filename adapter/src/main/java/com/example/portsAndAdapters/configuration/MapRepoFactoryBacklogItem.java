package com.example.portsAndAdapters.configuration;

import com.example.portsAndAdapters.adapter.out.persistence.map.MapRepoBacklogItem;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MapRepoFactoryBacklogItem {

    public MapRepoBacklogItem createBacklogItemMapRepo(){
        return new MapRepoBacklogItem();
    }

}
