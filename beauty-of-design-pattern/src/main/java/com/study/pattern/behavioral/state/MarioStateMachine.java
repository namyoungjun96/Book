package com.study.pattern.behavioral.state;

public class MarioStateMachine {
    private int score;
    private IMario currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = new SmallMario(this);
    }

    public void obtainMushroom() {
        this.currentState.obtainMushroom();
    }

    public void obtainCape() {
        this.currentState.obtainCape();
    }

    public void obtainFireFlower() {
        this.currentState.obtainFireFlower();
    }

    public void meetMonster() {
        this.currentState.meetMonster();
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public State getCurrentState() {
        return this.currentState.getName();
    }

    public void setCurrentState(IMario currentState) {
        this.currentState = currentState;
    }
}
