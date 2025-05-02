package com.study.pattern.behavioral.chain_of_responsibility.first.improve;

public class HandlerA extends Handler {
    @Override
    public boolean doHandle() {
        System.out.println("HandlerA");
        boolean handle = false;
        // ...
        return handle;
    }
}
