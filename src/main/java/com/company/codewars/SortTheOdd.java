package com.company.codewars;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        for (int doPrzestawienia = 0; doPrzestawienia < array.length; doPrzestawienia++) {
            if (array[doPrzestawienia] % 2 == 1) {
                for (int czyMniejszy = doPrzestawienia + 1; czyMniejszy < array.length; czyMniejszy++) {
                    if(array[czyMniejszy] % 2 == 1 && array[doPrzestawienia] > array[czyMniejszy]){
                        array[doPrzestawienia] = array[doPrzestawienia] + array[czyMniejszy];
                        array[czyMniejszy] = array[doPrzestawienia] - array[czyMniejszy];
                        array[doPrzestawienia] = array[doPrzestawienia] - array[czyMniejszy];
                    }
                }
            }
        }
        return array;
    }
}
