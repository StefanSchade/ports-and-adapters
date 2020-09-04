package com.example.portsandadapters.domain.model.aggregate.two;

import com.example.portsandadapters.domain.model.base.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter(AccessLevel.PRIVATE)
@Getter
@SuperBuilder
public class GenericEntity002 implements Entity {

    private final Long referenceToAggregateOne;

    private final int linkedListOrder;

    private final String name;

}
