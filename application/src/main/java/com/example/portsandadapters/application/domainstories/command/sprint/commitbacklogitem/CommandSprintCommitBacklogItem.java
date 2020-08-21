package com.example.portsandadapters.application.domainstories.command.sprint.commitbacklogitem;

import com.example.portsandadapters.application.port.in.command.CommandAbstraction;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PRIVATE)
@Builder
public class CommandSprintCommitBacklogItem implements CommandAbstraction {

    @NonNull private Long sprintId;

    @NonNull private Long backlogItemid;

}
