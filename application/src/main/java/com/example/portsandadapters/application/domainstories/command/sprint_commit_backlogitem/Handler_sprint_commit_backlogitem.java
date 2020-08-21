package com.example.portsandadapters.application.domainstories.command.sprint_commit_backlogitem;

import com.example.portsandadapters.application.port.in.command.Handler;
import com.example.portsandadapters.application.port.out.persistence.PersistenceAbstraction;
import com.example.portsandadapters.domain.model.aggregate.Sprint.BacklogItem;
import com.example.portsandadapters.domain.model.aggregate.Sprint.Sprint;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Handler_sprint_commit_backlogitem implements Handler<Command_sprint_commit_backlogitem> {

    @NonNull private final PersistenceAbstraction<Sprint, Long> sprintRepo;

    @NonNull private final PersistenceAbstraction<BacklogItem, Long> bliRepo;

    @Override
    public void handle(Command_sprint_commit_backlogitem command) {

        Sprint sprint = sprintRepo.findByID(command.getSprintId());

        BacklogItem backlogItem = bliRepo.findByID(command.getBacklogItemid());

        backlogItem.commitToSprint(sprint);

        sprintRepo.save(command.getSprintId(), sprint);

    }
}
