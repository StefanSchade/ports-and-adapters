package com.example.portsandadapters.adapter.out.persistence.jpa.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Slf4j
@Data
@Entity
@NoArgsConstructor
public class BacklogItemJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column(nullable = false)
    @NonNull
    public String name;

    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "sprint", nullable = true)
    public SprintJpa sprint;
}