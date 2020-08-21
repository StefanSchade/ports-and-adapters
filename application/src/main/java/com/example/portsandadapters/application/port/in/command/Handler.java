package com.example.portsandadapters.application.port.in.command;

public interface Handler<T extends Command> {

    public void handle(T commandInterface);

}
