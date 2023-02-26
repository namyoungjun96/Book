package org.chap02;

public class Apple {
    private Color color;
    private int weight;

    public Apple(int weight, Color color) {
        this.color = color;
        this.weight = weight;
    }

    public Apple() {
    }

    public Apple(Integer weight) {
        this.weight=weight;
    }

    public Color getColor() {
        return this.color;
    }
    public int getWeight() {
        return this.weight;
    }
}
