package chap01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterExample {
    public List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }

    public static class Apple {
        private String color;
        private int weight;

        public String getColor() {
            return this.color;
        }

        public int getWeight() {
            return this.weight;
        }

        public boolean isGreenApple(Apple apple) {
            return "green".equals(apple.getColor());
        }

        public boolean isHeavyApple(Apple apple) {
            return apple.getWeight() > 150;
        }
    }

}
