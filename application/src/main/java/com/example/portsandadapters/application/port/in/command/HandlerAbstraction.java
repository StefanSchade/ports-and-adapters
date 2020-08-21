package com.example.portsandadapters.application.port.in.command;

import com.example.portsandadapters.application.port.out.persistence.PersistenceAbstraction;
import com.example.portsandadapters.domain.model.base.AggregateRoot;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter(AccessLevel.PRIVATE)
public abstract class HandlerAbstraction<A extends AggregateRoot, T extends CommandAbstraction> {

    @NonNull private final PersistenceAbstraction<A, Long> aggregateRepository;

    public abstract void handle(T commandInterface);

}
