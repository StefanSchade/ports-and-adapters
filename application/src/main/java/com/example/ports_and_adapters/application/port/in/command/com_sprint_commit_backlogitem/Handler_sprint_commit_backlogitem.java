package com.example.ports_and_adapters.application.port.in.command.com_sprint_commit_backlogitem;

import com.example.ports_and_adapters.application.port.in.command.Handler;
import com.example.ports_and_adapters.application.port.out.persistence.PersistenceAbstraction;
import com.example.ports_and_adapters.domain.model.aggregate.Sprint.BacklogItem;
import com.example.ports_and_adapters.domain.model.aggregate.Sprint.Sprint;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Handler_sprint_commit_backlogitem implements Handler<Command_sprint_commit_backlogitem> {

    PersistenceAbstraction<Sprint, Long> sprintRepo;

    PersistenceAbstraction<BacklogItem, Long> bliRepo;

    @Override
    public void handle(Command_sprint_commit_backlogitem command) {

        sprintRepo = command.getSprintRepo();

        bliRepo = command.getBacklogitemRepo();

        Sprint sprint = sprintRepo.findByID(command.getSprintId());

        BacklogItem backlogItem = bliRepo.findByID(command.getBacklogItemid());

        backlogItem.commitToSprint(sprint);

        sprintRepo.save(command.getSprintId(), sprint);

    }
}
