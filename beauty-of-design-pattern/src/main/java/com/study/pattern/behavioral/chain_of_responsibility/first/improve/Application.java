package com.study.pattern.behavioral.chain_of_responsibility.first.improve;

public class Application {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.addHandler(new HandlerA());
        chain.handle();
    }
}
