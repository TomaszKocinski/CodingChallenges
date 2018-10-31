package com.company.codewars;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Order {
    public static String order(String words) {
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparingInt(value -> value
                        .chars()
                        .filter((a) -> Character.isDigit(a))
                        .findAny().getAsInt()))
                .collect(Collectors.joining(" "));
    }
}
