package com.example.portsandadapters.configuration;

import com.example.portsandadapters.adapter.out.persistence.map.GenericMapService;
import com.example.portsandadapters.domain.contract.AggregateRoot;
import com.example.portsandadapters.domain.contract.IdentifiedObject;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MapAdapterFactory {

    public <T extends IdentifiedObject & AggregateRoot> GenericMapService<T, Long> createMapRepo() {

        return new GenericMapService<>();
    }

}
