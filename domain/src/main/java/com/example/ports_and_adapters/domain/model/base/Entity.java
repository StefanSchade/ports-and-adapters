package com.example.ports_and_adapters.domain.model.base;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public abstract class Entity {

    private Long id;

}
