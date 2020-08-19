package com.example.portsAndAdapters.application.port.in.persistence;

import com.example.portsAndAdapters.domain.model.base.BaseEntity;

import java.util.Set;

public interface PersistenceAbstraction<V extends BaseEntity, K> {

    Set<V> findAll();

    V findByID(K key);

    V save(Long id, V value);

    void delete(V value);

    void deleteByID(K key);

}
