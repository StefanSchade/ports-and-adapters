package com.example.ports_and_adapters.application.port.in.command.com_sprint_commit_backlogitem;

import com.example.ports_and_adapters.application.port.in.command.Command;
import com.example.ports_and_adapters.application.port.out.persistence.PersistenceAbstraction;
import com.example.ports_and_adapters.domain.model.aggregate.Sprint.BacklogItem;
import com.example.ports_and_adapters.domain.model.aggregate.Sprint.Sprint;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PRIVATE)
@Builder
public class Command_sprint_commit_backlogitem implements Command {

    @NonNull PersistenceAbstraction<Sprint, Long> sprintRepo;

    @NonNull PersistenceAbstraction<BacklogItem, Long> backlogitemRepo;

    @NonNull private Long sprintId;

    @NonNull private Long backlogItemid;

}
