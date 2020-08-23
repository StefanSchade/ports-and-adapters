package com.example.portsandadapters.application.domainstories.command.sprint.commitbacklogitem;

import com.example.portsandadapters.application.port.in.command.HandlerAbstraction;
import com.example.portsandadapters.application.port.out.persistence.PersistenceAbstraction;
import com.example.portsandadapters.domain.model.aggregate.Sprint.BacklogItem;
import com.example.portsandadapters.domain.model.aggregate.Sprint.Sprint;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class HandlerSprintCommitBacklogItem implements HandlerAbstraction<CommandSprintCommitBacklogItem> {

    @NonNull private final PersistenceAbstraction<Sprint, Long> aggregateRepository;

    @Override
    public void handle(CommandSprintCommitBacklogItem command) {

        log.info("in command handler");
        log.debug("debug");

        Sprint backlog = aggregateRepository.findByID(0L);
        Sprint sprint = aggregateRepository.findByID(command.getSprintId());
        BacklogItem bli = backlog.getBacklogItemById(command.getBacklogItemid());
//        backlog.removeBacklogItemById(command.getBacklogItemid());
//        sprint.addBacklogItem(bli);
//        aggregateRepository.save(0L, backlog);
//        aggregateRepository.save(command.getSprintId(), sprint);
    }
}
