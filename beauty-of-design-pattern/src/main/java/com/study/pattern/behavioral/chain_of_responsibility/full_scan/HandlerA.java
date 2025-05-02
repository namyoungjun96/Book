package com.study.pattern.behavioral.chain_of_responsibility.full_scan;

public class HandlerA extends Handler {
    @Override
    public void doHandle() {
        System.out.println("HandlerA");
        // ...
    }
}
