package com.example.portsandadapters.application.domainstories.command.sprint.commitbacklogitem;

import com.example.portsandadapters.application.port.in.command.HandlerAbstraction;
import com.example.portsandadapters.application.port.out.persistence.PersistenceAbstraction;
import com.example.portsandadapters.domain.model.aggregate.Sprint.Sprint;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HandlerSprintCommitBacklogItem implements HandlerAbstraction<CommandSprintCommitBacklogItem> {

    @NonNull private final PersistenceAbstraction<Sprint, Long> aggregateRepository;

    @Override
    public void handle(CommandSprintCommitBacklogItem command) {

        Sprint sprint = aggregateRepository.findByID(command.getSprintId());

     //   backlogItem.commitToSprint(sprint);

        aggregateRepository.save(command.getSprintId(), sprint);

    }
}
