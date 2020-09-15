package com.example.portsandadapters.port.inbound.command.impl;

import com.example.portsandadapters.port.inbound.command.CommandInput;

public class TimeoutRetryDecorator<T extends CommandInput>  {

    private static final int RETRY_NUMBER = 5;

    private static final int RETRY_INTERVAL = 500;

  //  public TimeoutRetryDecorator(HandlerWithTimeoutAbstraction<T> decoratee) {
 //       super(decoratee);
 //   }

//    @Override
//    public CommandHandler<T> handle(T commandInterface) throws TimeoutException {
//        return handleWithRetry(commandInterface, RETRY_NUMBER);
//    }
//
//    private CommandHandler<T> handleWithRetry(T commandInterface, int retries_left) throws TimeoutException {
//
//        try {
//            decoratee.handle(commandInterface);
//        } catch (TimeoutException tex) {
//
//            if (retries_left <= 0) {
//                try {
//                    Thread.sleep(RETRY_INTERVAL);
//                } catch (InterruptedException e) {
//                    //todo logging
//                }
//            } else {
//                throw tex;
//            }
//        }
//
//        //todo dirty fix - has to be adapted later
//        return null;
//    }
}
