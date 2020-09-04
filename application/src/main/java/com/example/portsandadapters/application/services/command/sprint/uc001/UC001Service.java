package com.example.portsandadapters.application.services.command.sprint.uc001;

import com.example.portsandadapters.domain.aggregate.one.GenericAggregateRoot001;
import com.example.portsandadapters.ports.inbound.command.CommandHandler;
import com.example.portsandadapters.ports.outbound.persistence.PersistenceAbstraction;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class UC001Service extends CommandHandler<UC001Input, UC001Output> {

    @NonNull private PersistenceAbstraction<GenericAggregateRoot001, Long> aggregateRepository;

    @Override
    public UC001Output process(UC001Input input) {
        log.info("processing usecase 1");
        UC001Output output = new UC001Output();


//        GenericAggregateRoot001 genericAggregateRoot001 = GenericAggregateRoot001.builder()
//                                                                                 .name(input.getName())
//                                                                                 .build();
//
//        aggregateRepository.save(genericAggregateRoot001);
//
//        Set<GenericAggregateRoot001> resultset = aggregateRepository.findAll();
//
//        GenericAggregateRoot001 response;
//
//        if (resultset.isEmpty()) {
//            response = GenericAggregateRoot001.builder()
//                                              .name("empty")
//                                              .build();
//
//        } else {
//            response = resultset.iterator()
//                                .next();
//        }
//
//        output.setResponseObject(response);
//
        return output;

    }
}
