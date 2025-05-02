package com.study.pattern.behavioral.chain_of_responsibility.first.improve;

public class HandlerB extends Handler {
    @Override
    public boolean doHandle() {
        System.out.println("HandlerB");
        boolean handle = false;
        // ...
        return handle;
    }
}
