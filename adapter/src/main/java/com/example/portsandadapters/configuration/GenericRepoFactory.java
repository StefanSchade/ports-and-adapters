package com.example.portsandadapters.configuration;

import com.example.portsandadapters.adapter.out.persistence.map.GenericMapRepo;
import com.example.portsandadapters.domain.model.base.Entity;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GenericRepoFactory {

    public <T extends Entity> GenericMapRepo<T, Long> createMapRepo(String configuration){
        return new GenericMapRepo<>();
    }
}
