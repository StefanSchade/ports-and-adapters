package com.example.portsAndAdapters.domain.model.base;

import lombok.Getter;

@Getter
public abstract class BaseEntity {

    private static long idcounter = 0;

    public final Long id;

    protected BaseEntity() {
        id = ++idcounter;
    }
}
