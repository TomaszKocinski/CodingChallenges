package com.company.codewars;

        import java.util.Arrays;

public class EqualSidesOfAnArray {
    public static int findEvenIndex(int[] arr) {
        int rightSide = Arrays.stream(arr)
                .sum()
                - arr[0];
        int leftSide = 0;
        for (int i = 0; i < arr.length; i++) {
            if (rightSide == leftSide) {
                return i ;
            }
            leftSide += arr[i];
            if (i < arr.length - 1) {
                rightSide -= arr[i+1];
            }
        }
        return -1;
    }
}
