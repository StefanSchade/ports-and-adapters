package com.example.portsandadapters.application.port.in.command;

import java.util.concurrent.TimeoutException;

public interface HandlerAbstraction<T extends CommandAbstraction> {

    public void handle(T commandInterface) throws TimeoutException;

}
