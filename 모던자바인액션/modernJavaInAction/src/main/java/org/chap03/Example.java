package org.chap03;

import org.chap02.Apple;
import org.chap02.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example {
    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED));

        Predicate<Apple> applePredicate = (Apple a) -> a.getWeight() > 150;
        List<Apple> weightApples = filter(apples, applePredicate);

        Function<String, Integer> len = String::length;
        PrintExample printExample = new PrintExample();
        printExample.printStr();

        List<String> str = Arrays.asList("a", "b", "A", "B");
        str.sort(String::compareToIgnoreCase);

        for(String temp : str) {
            System.out.println(temp);
        }

        Supplier<Apple> c1 = Apple::new;
        Apple a1 = c1.get();

        List<Apple> appleList = new MakeApples().get();
        for(Apple apple : appleList) {
            System.out.println("사과의 무게: " + apple.getWeight());
        }

        apples.sort(Comparator.comparingInt(Apple::getWeight));
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for(T t : list) {
            if(p.test(t)) {
                results.add(t);
            }
        }
        return results;
    }
}
