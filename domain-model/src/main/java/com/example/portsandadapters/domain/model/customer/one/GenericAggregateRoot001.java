package com.example.portsandadapters.domain.model.customer.one;

import com.example.portsandadapters.domain.contract.AggregateRoot;
import com.example.portsandadapters.domain.contract.Entity;
import com.example.portsandadapters.domain.contract.IdentifiedObject;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.LinkedList;
import java.util.List;

@Setter(AccessLevel.PRIVATE)
@Getter
@SuperBuilder
public class GenericAggregateRoot001 extends IdentifiedObject implements AggregateRoot, Entity {

    private final List<GenericEntity001> listOfDependentEntities = new LinkedList<>();

    private String name;

    public void behaviour001(String name, GenericValue001 value) {

        GenericEntity001 genericEntity002 = GenericEntity001.builder()
                                              .name(name)
                                              .referenceValueObject(value)
                                              .build();

        listOfDependentEntities.add(genericEntity002);

    }

}
