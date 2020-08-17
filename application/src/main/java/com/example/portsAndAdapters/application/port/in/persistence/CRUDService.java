package com.example.portsAndAdapters.application.port.in.persistence;

import java.util.Set;

public interface CRUDService<T, ID> {

    Set<T> findAll();

    T findByID(ID id);

    T save(ID id, T object);

    void delete(T object);

    void deleteByID(ID id);

}
