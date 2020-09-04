package com.example.portsandadapters.domain.model.aggregate.one;

import com.example.portsandadapters.domain.model.base.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter(AccessLevel.PRIVATE)
@Getter
@SuperBuilder
public class GenericEntity001 implements Entity {

    private final String name;

    private final GenericValue001 referenceValueObject;

}
