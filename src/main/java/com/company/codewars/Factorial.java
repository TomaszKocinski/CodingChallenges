package com.company.codewars;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Factorial {
    public int factorial(int n) {
        // Happy coding :-)
        if (n<0 || n >12) {
            throw new IllegalArgumentException();
        }
        if (n == 0){
            return 1;
        }
        List<Integer> upToN = IntStream.rangeClosed(1, n)
                .boxed().collect(Collectors.toList());
        return upToN.stream()
                .reduce(1, (aLong, aLong2) -> aLong * aLong2);
    }
}
