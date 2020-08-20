package com.example.portsAndAdapters.configuration;

import com.example.portsAndAdapters.adapter.out.persistence.map.GenericMapRepo;
import com.example.portsAndAdapters.domain.model.base.BaseEntity;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GenericRepoFactory {

    public <T extends BaseEntity> GenericMapRepo<T, Long> createMapRepo(String configuration){
        return new GenericMapRepo<>();
    }
}
