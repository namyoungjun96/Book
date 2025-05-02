package com.study.pattern.behavioral.chain_of_responsibility.first.original;

public class HandlerA extends Handler {
    @Override
    public void handle() {
        System.out.println("HandlerA");
        boolean handled = false;
        // ...
        if (!handled && successor != null)
            successor.handle();
    }
}
