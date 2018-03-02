package com.company.algorithms.warmups;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author: tkocinski on 04.12.2017 <tomasz.kocinski@cov.gov.pl>
 */
public class BirthdayCakeCandles {
    public static void main(String[] args) throws Throwable {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<Integer> list = new ArrayList();
        for (int i = 0; size > i; i++){
            list.add(scanner.nextInt());
        }
        Integer sizeOfLongestCandle = list.stream().max(Comparator.naturalOrder()).orElseThrow(() -> new RuntimeException("stream didnt find max"));
        long numberOfLongestCandles = list.stream().filter(lambda -> lambda.equals(sizeOfLongestCandle)).count();
        System.out.println(numberOfLongestCandles);
    }
}
