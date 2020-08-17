package com.example.portsAndAdapters.application.port.in.persistence;

import com.example.portsAndAdapters.domain.model.base.BaseEntity;

import java.util.Set;

public interface CRUDService<T extends BaseEntity> {

    Set<T> findAll();

    T findByID(Long id);

    T save(Long id, T object);

    void delete(T object);

    void deleteByID(Long id);

}
