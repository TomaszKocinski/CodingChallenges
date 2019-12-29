package com.company.codewars;

        import java.util.Arrays;

public class FindTheUniqueNumber {
    public static double findUniq(double arr[]) {
        double repeatingNumber;
        if (arr[0] == arr[1] || arr[0] == arr[2]){
            repeatingNumber = arr[0];
        } else {
            repeatingNumber = arr[1];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println( repeatingNumber);
        return Arrays.stream(arr)
                .filter(value -> value != repeatingNumber)
                .findAny()
                .orElseThrow(() -> new RuntimeException("There wasnt diffrent value in array"));
    }
}
