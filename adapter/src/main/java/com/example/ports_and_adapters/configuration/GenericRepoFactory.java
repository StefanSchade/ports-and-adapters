package com.example.ports_and_adapters.configuration;

import com.example.ports_and_adapters.adapter.out.persistence.map.GenericMapRepo;
import com.example.ports_and_adapters.domain.model.base.Entity;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GenericRepoFactory {

    public <T extends Entity> GenericMapRepo<T, Long> createMapRepo(String configuration){
        return new GenericMapRepo<>();
    }
}
