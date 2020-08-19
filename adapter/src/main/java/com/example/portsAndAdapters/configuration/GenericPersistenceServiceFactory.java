package com.example.portsAndAdapters.configuration;

import com.example.portsAndAdapters.adapter.out.persistence.map.GenericService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


@Service
public class GenericPersistenceServiceFactory<V, K> {

    @Bean
    public GenericService<V,K> getGenericPersistenceService(String profile) {
        final GenericService<V, K> genServ = new GenericService<>();
        return genServ;
    }

}
