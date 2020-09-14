package com.example.portsandadapters.persistence;

import com.example.portsandadapters.domain.contract.AggregateRoot;

import java.util.Set;

public interface PersistenceAbstraction<V extends AggregateRoot, K> {

    Set<V> findAll();

    V findByID(K key);

    void delete(V value);

    V save(V value);

    void deleteByID(K key);

}