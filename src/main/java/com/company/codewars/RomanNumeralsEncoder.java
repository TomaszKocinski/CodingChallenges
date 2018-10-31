package com.company.codewars;


public class RomanNumeralsEncoder {
    public String solution(int n) {
        if (n >= 4 * RomanNumerals.values()[0].getArabianValue()) {
            throw new IllegalArgumentException("Wrong start paramterers");
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (RomanNumerals romanNumerals : RomanNumerals.values()) {
            while (romanNumerals.getArabianValue() <= n) {
                if ((romanNumerals.getArabianValue() * 2) -1 <=  n) {
                    RomanNumerals higherRomanNumeral = romanNumerals.getHigherRomanNumeral();
                    stringBuilder.append(RomanNumerals.I.name() + higherRomanNumeral.name());
                    n -= 4 * romanNumerals.getArabianValue();
                }
                else {
                    stringBuilder.append(romanNumerals.name());
                    n -= romanNumerals.getArabianValue();
                }
            }
        }

        return stringBuilder.toString();
    }
}

enum RomanNumerals {
    M(1000),
    D(500),
    C(100),
    L(50),
    X(10),
    V(5),
    I(1);

    private int arabianValue;

    RomanNumerals(int arabianValue) {
        this.arabianValue = arabianValue;
    }

    public int getArabianValue() {
        return arabianValue;
    }

    public RomanNumerals getHigherRomanNumeral() {
        RomanNumerals previousRomanNumeral = this;
        for (RomanNumerals romanNumerals1 : RomanNumerals.values()) {
            if (romanNumerals1.equals(this)) {
                return previousRomanNumeral;
            }
            previousRomanNumeral = romanNumerals1;
        }
        throw new IllegalArgumentException("Your brilliant getting of higher roman number is fucked up");
    }

}
