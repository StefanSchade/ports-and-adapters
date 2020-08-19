package com.example.portsAndAdapters.application.port.in.persistence;

import java.util.Set;

public interface PersistenceAbstraction<V, K> {

    Set<V> findAll();

    V findByID(K key);

    V save(K key, V value);

    void delete(V value);

    void deleteByID(K key);

}
