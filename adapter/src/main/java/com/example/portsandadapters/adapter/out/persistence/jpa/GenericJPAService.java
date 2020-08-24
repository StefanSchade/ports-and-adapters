package com.example.portsandadapters.adapter.out.persistence.jpa;

import com.example.portsandadapters.application.port.out.persistence.PersistenceAbstraction;
import com.example.portsandadapters.domain.model.base.AggregateRoot;
import lombok.AllArgsConstructor;
import lombok.NonNull;

import java.util.Set;

@AllArgsConstructor
public class GenericJPAService<V extends AggregateRoot, K> implements PersistenceAbstraction<V, K> {

    @NonNull private final BacklogItemRepository backlogItemRepository;

    @NonNull private final SprintRepository sprintRepository;

    public Set<V> findAll() {
        return null;
    }

    public V findByID(K key) {
        return null;
    }

    public V save(V value) {
        return null;
    }

    public V save(Long id, V value) {
        return null;
    }

    public void delete(V value) {
    }

    public void deleteByID(K key) {
    }
}