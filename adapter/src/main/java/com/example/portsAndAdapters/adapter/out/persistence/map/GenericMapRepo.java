package com.example.portsAndAdapters.adapter.out.persistence.map;

import com.example.portsAndAdapters.application.port.in.persistence.PersistenceAbstraction;
import com.example.portsAndAdapters.domain.model.base.Entity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GenericMapRepo<V extends Entity, K> implements PersistenceAbstraction<V, K> {

    protected Map<Long, V> map = new HashMap<>();

    public Set<V> findAll() {
        return new HashSet<>(map.values());
    }

    public V findByID(K key) {
        return map.get(key);
    }

    public V save(V value) {
        save(value.getId(), value);
        return value;
    }

    public V save(Long id, V value) {
        map.put(id, value);
        return value;
    }

    public void delete(V value) {
        map.entrySet()
           .removeIf(entry -> entry.getValue()
                                   .equals(value));
    }

    public void deleteByID(K key) {
        map.remove(key);
    }
}