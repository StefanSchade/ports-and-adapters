package com.example.portsAndAdapters.domain.model.base;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public abstract class Entity {

    private Long id;

}
