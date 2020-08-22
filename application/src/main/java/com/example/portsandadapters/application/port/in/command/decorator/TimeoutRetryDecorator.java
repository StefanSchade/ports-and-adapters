package com.example.portsandadapters.application.port.in.command.decorator;

import com.example.portsandadapters.application.port.in.command.CommandAbstraction;
import com.example.portsandadapters.application.port.in.command.HandlerAbstraction;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.concurrent.TimeoutException;

@RequiredArgsConstructor
public class TimeoutRetryDecorator<T extends CommandAbstraction> implements HandlerAbstraction<T> {

    private static final int RETRY_NUMBER = 5;

    private static final int RETRY_INTERVAL = 500;

    @NonNull private HandlerAbstraction<T> decoratee;

    @Override
    public void handle(T commandInterface) throws TimeoutException {
        handleWithRetry(commandInterface, RETRY_NUMBER);
    }

    private void handleWithRetry(T commandInterface, int retries_left) throws TimeoutException {

        try {
            decoratee.handle(commandInterface);
        } catch (TimeoutException tex) {

            if(retries_left <= 0 ) {
                try {
                    Thread.sleep(RETRY_INTERVAL);
                } catch (InterruptedException e) {
                    //todo logging
                }
            } else {
                throw tex;
            }
        }
    }

}
