package com.example.portsandadapters.application.port.in.command;

import com.example.portsandadapters.domain.model.aggregate.sprint.Sprint;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class CommandOutput {

    public Boolean failed = false;

    public Throwable error = null;

    Sprint responseObject;

}
