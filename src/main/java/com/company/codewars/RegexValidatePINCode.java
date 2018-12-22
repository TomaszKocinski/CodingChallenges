package com.company.codewars;


public class RegexValidatePINCode {
    public static boolean validatePin(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }
}
