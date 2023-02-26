package chap03;

import chap01.FilterExample;
import chap02.Color;

public class Apple {
    private Color color;
    private int weight;

    public Apple(int weight, Color color) {
        this.color = color;
        this.weight = weight;
    }

    public Apple() {
    }

    public Color getColor() {
        return this.color;
    }

    public int getWeight() {
        return this.weight;
    }

    public boolean isGreenApple(FilterExample.Apple apple) {
        return "green".equals(apple.getColor());
    }

    public boolean isHeavyApple(FilterExample.Apple apple) {
        return apple.getWeight() > 150;
    }
}
