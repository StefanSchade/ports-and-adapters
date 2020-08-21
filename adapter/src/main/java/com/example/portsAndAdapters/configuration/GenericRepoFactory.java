package com.example.portsAndAdapters.configuration;

import com.example.portsAndAdapters.adapter.out.persistence.map.GenericMapRepo;
import com.example.portsAndAdapters.domain.model.base.Entity;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GenericRepoFactory {

    public <T extends Entity> GenericMapRepo<T, Long> createMapRepo(String configuration){
        return new GenericMapRepo<>();
    }
}
