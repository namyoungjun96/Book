package com.study.pattern.behavioral.chain_of_responsibility.first.original;

public class HandlerB extends Handler {
    @Override
    public void handle() {
        System.out.println("HandlerB");
        boolean handled = false;
        // ...
        if (!handled && successor != null)
            successor.handle();
    }
}
