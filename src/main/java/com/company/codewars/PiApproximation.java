package com.company.codewars;

public class PiApproximation {
    public static String iterPi2String(Double epsilon) {

        double ourPi = 0;
        int i = 0;
//        while (Math.abs(Math.PI - ourPi * 4)  > epsilon) {
        while (i != 224) {
            ourPi += Math.pow(-1.0, i/2) / (2 * i + 1) ;
            System.out.println(i + " " + ourPi * 4 + " " + Math.abs(Math.PI/4 - ourPi) * 4 + " " + Math.pow(-1.0, i) / (2 * i + 1) );
            i = i + 2;
        }
        return "[" + i + "," + ourPi*4 + "]";
    }
}
