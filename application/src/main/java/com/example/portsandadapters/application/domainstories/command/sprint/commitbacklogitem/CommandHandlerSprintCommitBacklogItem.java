package com.example.portsandadapters.application.domainstories.command.sprint.commitbacklogitem;

import com.example.portsandadapters.application.port.in.command.CommandHandler;
import com.example.portsandadapters.application.port.in.command.CommandOutput;
import com.example.portsandadapters.application.port.out.persistence.PersistenceAbstraction;
import com.example.portsandadapters.domain.model.aggregate.sprint.BacklogItem;
import com.example.portsandadapters.domain.model.aggregate.sprint.Sprint;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class CommandHandlerSprintCommitBacklogItem extends CommandHandler<SprintCommitBacklogItemInput, CommandOutput> {

    @NonNull private PersistenceAbstraction<Sprint, Long> aggregateRepository;

    @Override
    public void process(SprintCommitBacklogItemInput input) {
        log.info("in command handler");
        log.debug("debug");

        Sprint backlog = aggregateRepository.findByID(0L);
        Sprint sprint = aggregateRepository.findByID(input.getSprintId());
        BacklogItem bli = backlog.getBacklogItemById(input.getBacklogItemid());
        backlog.removeBacklogItemById(input.getBacklogItemid());
        sprint.addBacklogItem(bli);
        aggregateRepository.save(backlog);
        aggregateRepository.save(sprint);
    }
}
