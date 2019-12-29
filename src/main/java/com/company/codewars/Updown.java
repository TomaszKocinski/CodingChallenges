package com.company.codewars;

import java.util.Arrays;

public class Updown {
    public static String arrange(String strng) {
        String[] s = strng.split(" ");
        for (int i = 0; i < s.length - 1; i++) {
            if (i % 2 == 0 && s[i].length() > s[i + 1].length()) {
                changePlacesOfArray(s, i);
            } else if (i % 2 == 1 && s[i].length() < s[i + 1].length()) {
                changePlacesOfArray(s, i);
            }
        }
        for (int i = 0; i < s.length; i += 1) {
            if (i % 2 == 0 ) {
                s[i] = s[i].toLowerCase();
            } else {
                s[i] = s[i].toUpperCase();
            }
        }
        return Arrays.stream(s)
                .reduce((s1, s2) -> s1 + " " + s2)
                .orElseThrow(() -> new RuntimeException("Something went wrong"));
    }

    private static void changePlacesOfArray(String[] s, int i) {
        String temp = s[i];
        s[i] = s[i + 1];
        s[i + 1] = temp;
    }
}
