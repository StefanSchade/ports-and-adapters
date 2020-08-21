package com.example.portsandadapters.domain.model.base;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public abstract class AggregateRoot {

    private Long id;

}
