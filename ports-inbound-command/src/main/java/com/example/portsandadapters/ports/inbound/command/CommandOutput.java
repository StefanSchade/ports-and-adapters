package com.example.portsandadapters.ports.inbound.command;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class CommandOutput {

    public Boolean failed = false;

    public Throwable error = null;
}
