package com.company.algorithms.warmups;

import java.util.Scanner;

/**
 * @author: tkocinski on 04.12.2017 <tomasz.kocinski@cov.gov.pl>
 */
public class Staircase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < size; j++) {
                if (j < i) {
                    stringBuilder.append(" ");
                } else {
                    stringBuilder.append("#");
                }
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder.toString());

    }
}
