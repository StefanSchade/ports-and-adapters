package com.example.portsAndAdapters.adapter.out.persistence.map;

import com.example.portsAndAdapters.application.port.in.persistence.CRUDService;
import com.example.portsAndAdapters.domain.model.base.BaseEntity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractService<T extends BaseEntity> implements CRUDService<T> {

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