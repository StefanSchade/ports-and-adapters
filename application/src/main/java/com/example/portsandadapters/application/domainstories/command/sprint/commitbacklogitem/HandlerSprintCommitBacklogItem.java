package com.example.portsandadapters.application.domainstories.command.sprint.commitbacklogitem;

import com.example.portsandadapters.application.port.in.command.HandlerAbstraction;
import com.example.portsandadapters.domain.model.aggregate.Sprint.Sprint;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class HandlerSprintCommitBacklogItem extends HandlerAbstraction<Sprint, CommandSprintCommitBacklogItem> {

    @Override
    public void handle(CommandSprintCommitBacklogItem command) {

        Sprint sprint = this.getAggregateRepository().findByID(command.getSprintId());

  //      backlogItem.commitToSprint(sprint);

        this.getAggregateRepository().save(command.getSprintId(), sprint);

    }
}
