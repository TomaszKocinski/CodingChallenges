package com.company.codewars;

public class NumberFun {
    public static long findNextSquare(long sq) {
        double number = Math.sqrt(sq);
        if (number == Math.floor(number)){
            long floredNumber = (long)number + 1;
            return floredNumber * floredNumber;
        }
        return -1;
    }
}
