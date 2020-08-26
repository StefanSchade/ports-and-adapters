package com.example.portsandadapters.application.domainstories.command.sprint.commitbacklogitem;

import com.example.portsandadapters.application.port.in.command.CommandInput;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PRIVATE)
@Builder
public class SprintCommitBacklogItemInput implements CommandInput {

    @NonNull private Long sprintId;

    @NonNull private Long backlogItemid;

}
