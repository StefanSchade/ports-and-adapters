package com.example.portsAndAdapters.adapter.out.persistence.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractService<T, ID> {

    protected Map<ID, T> map = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    public T findByID(ID id) {
        return map.get(id);
    }

    public T save(ID id, T object) {
        map.put(id, object);
        return object;
    }

    public void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    public void deleteByID(ID id) {
        map.remove(id);
    }

}