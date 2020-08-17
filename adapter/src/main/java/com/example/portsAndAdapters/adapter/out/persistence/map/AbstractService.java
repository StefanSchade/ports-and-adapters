package com.example.portsAndAdapters.adapter.out.persistence.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractService<T> {

    protected Map<Long, T> map = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    public T findByID(Long id) {
        return map.get(id);
    }

    public T save(Long id, T object) {
        map.put(id, object);
        return object;
    }

    public void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    public void deleteByID(Long id) {
        map.remove(id);
    }

}