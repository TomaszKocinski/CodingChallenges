package com.company.codewars;

import java.util.Arrays;

public class FindOddCubes {
    public static int cubeOdd(int arr[]) {
        return Arrays.stream(arr)
                .filter(ints -> Math.abs(ints) % 2 == 1)
                .map(operand -> operand * operand * operand)
                .sum();
    }


}
