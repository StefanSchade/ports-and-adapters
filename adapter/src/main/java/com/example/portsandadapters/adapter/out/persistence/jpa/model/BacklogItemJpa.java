package com.example.portsandadapters.adapter.out.persistence.jpa.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Slf4j
@Data
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class BacklogItemJpa {

    @javax.persistence.Id
 //   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(nullable = false)
    @NonNull
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sprint", nullable = false)
    @NonNull
 //   @JsonBackReference necessary for REST
    private SprintJpa sprint;


}