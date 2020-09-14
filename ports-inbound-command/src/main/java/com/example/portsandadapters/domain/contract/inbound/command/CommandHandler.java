package com.example.portsandadapters.domain.contract.inbound.command;

public abstract class CommandHandler<I extends CommandInput, O extends CommandOutput> {

    protected O output;

    public abstract O process(I input);

}