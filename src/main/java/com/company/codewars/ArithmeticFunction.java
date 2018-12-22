package com.company.codewars;

import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArithmeticFunction {
    private static final Map<String, BiFunction<Integer, Integer, Integer>> map = Stream.of(new Object[][] {
            { "add", (BiFunction<Integer, Integer, Integer>)(o, o2) -> o + o2 },
            { "subtract", (BiFunction<Integer, Integer, Integer>)(o, o2) -> o - o2 },
            { "multiply", (BiFunction<Integer, Integer, Integer>)(o, o2) -> o * o2 },
            { "divide", (BiFunction<Integer, Integer, Integer>)(o, o2) -> o / o2 },
    }).collect(Collectors.toMap(data -> (String) data[0], data -> (BiFunction<Integer, Integer, Integer>) data[1]));

    public static int arithmetic(int a, int b, String operator) {
        return map.get(operator).apply(a, b);
    }
}
