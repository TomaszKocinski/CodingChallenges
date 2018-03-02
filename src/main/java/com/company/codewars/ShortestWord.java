package com.company.codewars;

import java.util.Arrays;
import java.util.stream.Stream;

public class ShortestWord {
    public static int findShort(String s) {
        String[] stringArray = s.split(" ");
        int lowest = Integer.MAX_VALUE;
        for (String s1 : stringArray) {
            if (s1.length() < lowest) {
                lowest = s1.length();
            }
        }
        return lowest;
    }

    public static int findShortStream(String s) {
        return Stream.of(s.split(" ")).mapToInt(String::length).min().getAsInt();
    }
}
