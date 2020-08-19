package com.example.portsAndAdapters.domain.model.base;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Setter(AccessLevel.PRIVATE)
@Getter
public abstract class BaseEntity {

    public Long id;

}
