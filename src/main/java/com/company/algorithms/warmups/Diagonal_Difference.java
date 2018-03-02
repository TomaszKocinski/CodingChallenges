package com.company.algorithms.warmups;

import java.util.Scanner;

/**
 * @author: tkocinski on 30.11.2017 <tomasz.kocinski@cov.gov.pl>
 */
import java.io.*;
import java.util.*;

public class Diagonal_Difference {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int diagonal = 0;
        int backdiagonal = 0;
        for (int i = 0; size > i; i++){
            for (int j = 0; size > j; j++){
                int holder = scanner.nextInt();
                stringBuilder.append(holder);
                if(i == j){
                    diagonal += holder;
                }
                if(i + 1 == Math.abs(j-size)){
                    backdiagonal += holder;
                }
            }
            stringBuilder.append('\n');
        }
        stringBuilder.append(diagonal);
        stringBuilder.append(backdiagonal);
        System.out.println(Math.abs(diagonal - backdiagonal));
        System.out.println(stringBuilder.toString());
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Diagonal_Difference. */
    }
}
