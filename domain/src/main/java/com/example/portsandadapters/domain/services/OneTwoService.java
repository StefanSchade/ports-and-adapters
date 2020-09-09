package com.example.portsandadapters.domain.services;

import com.example.portsandadapters.domain.aggregates.one.GenericAggregateRoot001;
import com.example.portsandadapters.domain.aggregates.two.GenericAggregateRoot002;
import com.example.portsandadapters.ports.outbound.persistence.PersistenceAbstraction;

public class OneTwoService {

    public void doSomethingInvolvingBothAggregates(PersistenceAbstraction<GenericAggregateRoot001, Long> repo001,
                                                   PersistenceAbstraction<GenericAggregateRoot002, Long> repo002,
                                                   Long aggOneRef, Long aggTwoRef, int numElement) {

        GenericAggregateRoot001 ag001 = repo001.findByID(aggOneRef);
        GenericAggregateRoot002 ag002 = repo002.findByID(aggTwoRef);

        String name = ag001.getListOfDependentEntities()
                           .get(numElement)
                           .getName();

        ag002.behaviour002(name, numElement);

        repo002.save(ag002);

    }

}
