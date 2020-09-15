package com.example.portsandadapters.adapter.out.persistence.map;

import com.example.portsandadapters.domain.contract.AggregateRoot;
import com.example.portsandadapters.domain.contract.IdentifiedObject;
import com.example.portsandadapters.port.repository.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class GenericMapService<V extends IdentifiedObject & AggregateRoot, K> implements Repository<V, K> {

    private static Long idcounter = 0L;

    protected Map<Long, V> map = new HashMap<>();

    @Override
    public Set<V> findAll() {

        return new HashSet<>(map.values());
    }

    @Override
    public V findByID(K key) {

        return map.get(key);
    }

    @Override
    public V save(V value) {

        if (value.getId()==null) {
            assignNewId(value);
        }
        map.put(value.getId(), value);
        return value;
    }

    private void assignNewId(V value) {

        Long id = new Random().nextLong();
    }

    @Override
    public void delete(V value) {
        map.entrySet()
           .removeIf(entry -> entry.getValue()
                                   .equals(value));
    }

    @Override
    public void deleteByID(K key) {

        map.remove(key);
    }

}