package com.example.portsandadapters.configuration;

import com.example.portsandadapters.adapter.out.persistence.map.GenericMapService;
import com.example.portsandadapters.ports.AggregateRoot;
import com.example.portsandadapters.persistence.IdentifiedObject;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MapAdapterFactory {

    public <T extends IdentifiedObject & AggregateRoot> GenericMapService<T, Long> createMapRepo() {
        return new GenericMapService<>();
    }
}
