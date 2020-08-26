package com.example.portsandadapters.adapter.out.persistence.jpa.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import java.util.List;

@Slf4j
@Data
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class SprintJpa {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(nullable = false)
    @NonNull
    private String name;

    @OneToMany(mappedBy = "sprint", cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.LAZY)
    private List<BacklogItemJpa> backlogItems;


}
