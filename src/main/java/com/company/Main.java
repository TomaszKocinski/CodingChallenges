package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arrayOfDaysInMonths = new int[]{50,52,53,63,73,84,25,23,56,23,63,74};
        int i = new Scanner(System.in).nextInt();
        System.out.println("Month number "+ i + " have " + arrayOfDaysInMonths[i-1] + " days.");
    }

}
