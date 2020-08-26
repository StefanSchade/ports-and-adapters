package com.example.portsandadapters.application.port.in.command.impl;

import com.example.portsandadapters.application.port.in.command.CommandHandler;
import com.example.portsandadapters.application.port.in.command.CommandInput;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class RuntimeExceptionDecorator<I, O> extends CommandHandler {

    CommandHandler decoratee;

    @Override
    public void process(CommandInput input) {
        try {
            decoratee.process(input);
        } catch (RuntimeException rex) { //todo implement error case
            rex.printStackTrace();
            log.error("An error occured", rex);
        }
    }
}

