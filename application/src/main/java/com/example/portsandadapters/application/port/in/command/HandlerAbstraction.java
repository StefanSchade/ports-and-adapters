package com.example.portsandadapters.application.port.in.command;

public interface HandlerAbstraction<T extends CommandAbstraction> {

    public void handle(T commandInterface);

}
