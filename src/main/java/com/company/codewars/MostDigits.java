package com.company.codewars;

public class MostDigits {
    public static int findLongest(int[] numbers) {
        int biggest = 0;
        int biggestNumberOfDigits = 0;
        for (int number : numbers) {
            int currentNumberOfDigits = numlength(number);
            if (currentNumberOfDigits > biggestNumberOfDigits) {
                biggest = number;
                biggestNumberOfDigits = currentNumberOfDigits;
            }
        }
        return biggest;

    }

    static int numlength(int number) {
        int numberOfDigits = 1;
        if (number == 0) {
            return numberOfDigits;
        }
        number = Math.abs(number);
        for (numberOfDigits = 0; number > 0; ++numberOfDigits) {
            number /= 10;
        }
        return numberOfDigits;
    }
}
