package com.company.codewars;

public class VasyaClerk {
    public static String Tickets(int[] peopleInLine) {
        int quartersInMachine = 0;
        int fiftysInMachine = 0;
        for (int customer : peopleInLine) {
            if (customer == 25) {
                quartersInMachine++;
            } else if (customer == 50 && quartersInMachine > 0) {
                quartersInMachine--;
                fiftysInMachine++;
            } else if (customer == 100 && fiftysInMachine > 0 && quartersInMachine > 0) {
                fiftysInMachine--;
                quartersInMachine--;
            } else {
                return "NO";
            }
        }
        return "YES";
    }

}
