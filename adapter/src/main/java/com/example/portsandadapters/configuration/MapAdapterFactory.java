package com.example.portsandadapters.configuration;

import com.example.portsandadapters.adapter.out.persistence.map.GenericMapService;
import com.example.portsandadapters.domain.model.base.AggregateRoot;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MapAdapterFactory {

    public <T extends AggregateRoot> GenericMapService<T, Long> createMapRepo(){
        return new GenericMapService<>();
    }
}
