package com.example.portsandadapters.configuration;

import com.example.portsandadapters.adapter.out.persistence.map.GenericMapRepo;
import com.example.portsandadapters.domain.model.base.AggregateRoot;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GenericRepoFactory {

    public <T extends AggregateRoot> GenericMapRepo<T, Long> createMapRepo(String configuration){
        return new GenericMapRepo<>();
    }
}
