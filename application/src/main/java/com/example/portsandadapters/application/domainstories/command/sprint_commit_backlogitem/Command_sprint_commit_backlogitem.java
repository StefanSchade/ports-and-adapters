package com.example.portsandadapters.application.domainstories.command.sprint_commit_backlogitem;

import com.example.portsandadapters.application.port.in.command.Command;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PRIVATE)
@Builder
public class Command_sprint_commit_backlogitem implements Command {

    @NonNull private Long sprintId;

    @NonNull private Long backlogItemid;

}
