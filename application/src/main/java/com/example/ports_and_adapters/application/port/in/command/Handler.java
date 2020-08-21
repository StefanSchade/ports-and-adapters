package com.example.ports_and_adapters.application.port.in.command;

public interface Handler<T extends Command> {

    public void handle(T commandInterface);

}
