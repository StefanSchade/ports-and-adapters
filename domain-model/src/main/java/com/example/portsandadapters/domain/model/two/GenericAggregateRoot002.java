package com.example.portsandadapters.domain.model.two;

import com.example.portsandadapters.domain.contract.AggregateRoot;
import com.example.portsandadapters.domain.contract.Entity;
import com.example.portsandadapters.domain.contract.IdentifiedObject;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter(AccessLevel.PRIVATE)
@Getter
@SuperBuilder
public class GenericAggregateRoot002 extends IdentifiedObject implements AggregateRoot, Entity {

    private final String name;

    private GenericEntity002 dependentEntity;

    public void behaviour002(String name, int number) {

        /* todo when there is messaging setup sync of the name via a domain event */

        this.dependentEntity = GenericEntity002.builder()
                                               .name(name)
                                               .linkedListOrder(number)
                                               .build();

    }

}
