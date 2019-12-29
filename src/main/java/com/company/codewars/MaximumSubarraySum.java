package com.company.codewars;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaximumSubarraySum {

    public static int sequence(int[] arr) {

        OptionalInt sum = Arrays.stream(arr)
                .reduce(Integer::sum);

        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.print('\n');
        if (sum.isPresent()) {
            int highestSum = sum.getAsInt();
            int currentValue = highestSum;
            for (int i = 0, j = arr.length - 1; i != j; ) {
                System.out.println("i=" + i + " j=" + j + " currentValue=" + currentValue + " highestValue=" + highestSum + " sum= " + Arrays.stream(arr, i, j+1)
                        .sum());

                if (arr[i] > arr[j]) {
                    currentValue -= arr[j];
                    j--;
                } else if (arr[i] < arr[j]){
                    currentValue -= (arr[i]);
                    i++;
                } else {
                    if (Arrays.stream(arr, i + 1, j)
                            .sum() >
                            Arrays.stream(arr, i + 2, j + 1)
                                    .sum()) {
                        currentValue -= arr[i];
                        i++;
                    }
                    else {
                        currentValue -= arr[j];
                        j--;
                    }
                }

                if (currentValue > highestSum){
                    highestSum = currentValue;
                }

            }
            return highestSum;
        }
        return sum.orElse(0);
    }
}
