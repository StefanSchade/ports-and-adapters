package com.example.ports_and_adapters.application.port.out.persistence;

import com.example.ports_and_adapters.domain.model.base.Entity;

import java.util.Set;

public interface PersistenceAbstraction<V extends Entity, K> {

    Set<V> findAll();

    V findByID(K key);

    V save(Long id, V value);

    void delete(V value);

    void deleteByID(K key);

}
