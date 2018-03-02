package com.company.algorithms.warmups;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author: tkocinski on 04.12.2017 <tomasz.kocinski@cov.gov.pl>
 */
public class TimeConversion {

    static String timeConversion(String s) {
        if ("PM".equals(s.substring(8))) {
            s = convertTo24HFormat(s);
        }
        s = s.substring(0,8);
        return s;
    }
    static String convertTo24HFormat(String s) {
        Long hours = Long.parseLong(s.substring(0,2));
        hours += 12;
        s = hours.toString().concat(s.substring(2));
        return s;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);


        // Write your code here
    }
}
