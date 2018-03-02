package com.company.codewars;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: tkocinski on 04.12.2017 <tomasz.kocinski@cov.gov.pl>
 */
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        Map<Character, Integer> mapOfCharCount = new HashMap<>();
        for(char element : text.toCharArray()){
            Integer fromMap = mapOfCharCount.get(element);
            if(fromMap == null){
                mapOfCharCount.put(element, 0);
            } else {
                mapOfCharCount.put(element, fromMap++);
            }
        }
        return (int) mapOfCharCount.values().stream().filter((a) -> a > 0).mapToLong(a -> a).sum();
    }
}
