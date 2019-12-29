package com.company;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;

public class Fizzbuzz {
    public static void fizzbuzz() {
        fizzbuzz(100,
                new PredicateAndValue(i -> i % 3 == 0, "BUZZ"),
                new PredicateAndValue(i -> i % 5 == 0, "FIZZ")
        );
    }
    private static void fizzbuzz(int repetition, PredicateAndValue... predicates){
        for (int i = 1; i <= repetition; i++) {
            int finalI = i;
            AtomicBoolean printRawValue = new AtomicBoolean(true);
            Arrays.stream(predicates).forEach(predicateStringPair -> {
                if (predicateStringPair.getPredicate().test(finalI)) {
                    System.out.print(predicateStringPair.getValue());
                    printRawValue.set(false);
                }
            });
            if (printRawValue.get()) {
                System.out.print(i);
            }
            System.out.print('\n');
        }
    }

    @AllArgsConstructor
    @Getter
    @Setter
    private static class PredicateAndValue{
        Predicate<Integer> predicate;
        String value;
    }
}
