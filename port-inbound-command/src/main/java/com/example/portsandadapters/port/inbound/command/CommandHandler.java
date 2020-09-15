package com.example.portsandadapters.port.inbound.command;

public abstract class CommandHandler<REQUEST extends CommandRequest, RESPONSE extends CommandResponse> {

    protected RESPONSE output;

    public abstract RESPONSE handle(REQUEST input);

}
