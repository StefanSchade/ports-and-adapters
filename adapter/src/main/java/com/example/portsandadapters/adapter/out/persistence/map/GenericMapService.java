package com.example.portsandadapters.adapter.out.persistence.map;

import com.example.portsandadapters.application.port.out.persistence.PersistenceAbstraction;
import com.example.portsandadapters.domain.model.base.AggregateRoot;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GenericMapService<V extends AggregateRoot, K> implements PersistenceAbstraction<V, K> {

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