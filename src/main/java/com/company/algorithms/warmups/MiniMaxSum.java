package com.company.algorithms.warmups;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author: tkocinski on 04.12.2017 <tomasz.kocinski@cov.gov.pl>
 */
public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLong());
        }
        list.sort(Comparator.naturalOrder());
        System.out.print(list.stream().limit(4).mapToLong(e -> e).sum());
        System.out.print(' ');
        System.out.print(list.stream().skip(1).mapToLong(e -> e).sum());


    }
}
