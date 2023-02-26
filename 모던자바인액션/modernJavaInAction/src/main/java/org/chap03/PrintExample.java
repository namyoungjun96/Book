package org.chap03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.chap03.Example.filter;

public class PrintExample {
    public void printStr() {
        List<String> temp = Arrays.asList("Hello World",
                "Don't Worry");
        List<String> str = filter(temp, this::isValidName);

        for(String s : str) {
            System.out.println(s);
        }
    }

    public boolean isValidName(String str) {
        return Character.isUpperCase(str.charAt(0));
    }
}
