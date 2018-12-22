package com.company.codewars;

import java.util.Iterator;
import java.util.LinkedList;

public class Dashatize {

    public static final String DASH = "-";

    public static String dashatize(int num) {
        LinkedList<Long> listOfDigits = new LinkedList<>();
        if (num == 0 ){
            listOfDigits.add(0L);
        }
        while (Math.abs((long)num)>0){
            int e = num % 10;
            listOfDigits.add(Math.abs((long)e));
            num = num / 10;
        }
        Iterator<Long> iterator = listOfDigits.iterator();
        StringBuilder digitsWithDashes = new StringBuilder();
        if (iterator.hasNext()){
            Long next = iterator.next();
            digitsWithDashes.append(next);
            if (iterator.hasNext()){
                addDashIfOdd(digitsWithDashes, next);
            }
        }
        while (iterator.hasNext()){
            Long next = iterator.next();
            addDashBeforeIfOddAndNumber(digitsWithDashes, next);
            if (!iterator.hasNext()){
                break;
            }
            addDashIfOdd(digitsWithDashes, next);
        }


        return digitsWithDashes.reverse().toString();
    }

    private static void addDashIfOdd(StringBuilder digitsWithDashes, Long next) {
        if (isOdd(next)){
            digitsWithDashes.append(DASH);
        }
    }

    private static void addDashBeforeIfOddAndNumber(StringBuilder digitsWithDashes, Long next) {
        if (!lastDigitIsDASH(digitsWithDashes)){
            addDashIfOdd(digitsWithDashes, next);
        }
        digitsWithDashes.append(next);
    }

    private static boolean lastDigitIsDASH(StringBuilder digitsWithDashes) {
        return digitsWithDashes.substring(digitsWithDashes.length()-1).equals(DASH);
    }

    private static boolean isOdd(Long next) {
        return next % 2 == 1;
    }

}
