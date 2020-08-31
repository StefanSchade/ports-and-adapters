package com.example.portsandadapters.application.services.command.sprint.uc001;

import com.example.portsandadapters.application.port.in.command.CommandHandler;
import com.example.portsandadapters.application.port.out.persistence.PersistenceAbstraction;
import com.example.portsandadapters.domain.model.aggregate.sprint.Sprint;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Set;

@Slf4j
@RequiredArgsConstructor
public class UC001Service extends CommandHandler<UC001Input, UC001Output> {

    @NonNull private PersistenceAbstraction<Sprint, Long> aggregateRepository;

    @Override
    public UC001Output process(UC001Input input) {
        log.info("processing usecase 1");

        UC001Output output = new UC001Output();

        Sprint sprint = Sprint.builder()
                              .name(input.getName())
                              .build();

        aggregateRepository.save(sprint);

        Set<Sprint> resultset = aggregateRepository.findAll();

        Sprint response;

        if (resultset.isEmpty()) {
            response = Sprint.builder()
                             .name("empty")
                             .build();

        } else {
            response = resultset.iterator()
                                .next();
        }

        output.setResponseObject(response);

        return output;

    }
}
