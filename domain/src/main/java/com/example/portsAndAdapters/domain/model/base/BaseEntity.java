package com.example.portsAndAdapters.domain.model.base;

import lombok.Generated;
import lombok.Getter;

@Getter
public abstract class BaseEntity {

    @Generated
    public Long id;

    protected BaseEntity() {
    }
}
