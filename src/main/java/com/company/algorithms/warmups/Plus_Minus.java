package com.company.algorithms.warmups;


import java.util.Scanner;

/**
 *
 */
public class Plus_Minus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float size = scanner.nextInt();
        float positive = 0;
        float negative = 0;
        float zeroes = 0;
        for (int i = 0; size > i; i++){
            float holder = scanner.nextInt();
            if(holder < 0){
                negative++;
            } else if(holder == 0){
                zeroes++;
            } else {
                positive++;
            }
        }
        System.out.println(positive/size);
        System.out.println(negative/size);
        System.out.println(zeroes/size);
    }
}
