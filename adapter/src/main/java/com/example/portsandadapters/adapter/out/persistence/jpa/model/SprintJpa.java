package com.example.portsandadapters.adapter.out.persistence.jpa.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Slf4j
@Data
@Entity
@NoArgsConstructor
public class SprintJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column(nullable = true)
    public String name;

    @Column(nullable = true)
    public Double sprintCapacityInStoryPoints;

    @OneToMany(mappedBy = "sprint", cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.LAZY)
    public List<BacklogItemJpa> backlogItems;
}
