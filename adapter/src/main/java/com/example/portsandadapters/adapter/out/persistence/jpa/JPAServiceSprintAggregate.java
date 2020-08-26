package com.example.portsandadapters.adapter.out.persistence.jpa;

import com.example.portsandadapters.adapter.out.persistence.jpa.model.BacklogItemJPAMapper;
import com.example.portsandadapters.adapter.out.persistence.jpa.model.BacklogItemJpa;
import com.example.portsandadapters.adapter.out.persistence.jpa.model.SprintJpa;
import com.example.portsandadapters.application.port.out.persistence.PersistenceAbstraction;
import com.example.portsandadapters.domain.model.aggregate.sprint.BacklogItem;
import com.example.portsandadapters.domain.model.base.AggregateRoot;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@NoArgsConstructor
public class JPAServiceSprintAggregate<V extends AggregateRoot, K> implements PersistenceAbstraction<V, K> {

    @Autowired BacklogItemJPAMapper backlogItemJPAMapper;

    @Autowired CrudRepository<BacklogItemJpa, Long> bliRepo;

    @Autowired CrudRepository<SprintJpa, Long> sprintRepo;

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

    private Set<BacklogItemJpa> mapBacklogItemListDomainToJPA(Set<BacklogItem> backlogItemSet) {
        return backlogItemSet.stream()
                             .map(backlogItemJPAMapper::backlogItemDomainToJpa)
                             .collect(Collectors.toSet());
    }

    private List<BacklogItemJpa> mapBacklogItemListDomainToJPA(List<BacklogItem> backlogItemList) {
        return backlogItemList.stream()
                              .map(backlogItemJPAMapper::backlogItemDomainToJpa)
                              .collect(Collectors.toList());
    }

}