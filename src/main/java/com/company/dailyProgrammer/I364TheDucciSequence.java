package com.company.dailyProgrammer;


import java.util.Arrays;

public class I364TheDucciSequence {
    public static void main(String[] args) throws InterruptedException{
        /*int[][] input = {{0, 653, 1854, 4063}};*/
        int[][] input = {{1, 5, 7, 9, 9}};
        for (int[] i : input) {
            ducci(i);
        }

    }

    public static void ducci(int[] input) throws InterruptedException {
        int size = input.length;
        int[] workable = new int[input.length];
        System.out.println(Arrays.toString(input));
        int zero = 0;
        for (int i = 0; !isEveryElementZero(input); i++) {
            if (i == 0) {
                zero = workable[0];
                workable[0] = Math.abs(input[i] - input[i+1]);
            } else if (i == size -1) {
                workable[i] = Math.abs(input[i] - zero);
                input = workable;
                System.out.println(Arrays.toString(workable));
                i = -1;
            } else{
                workable[i] = Math.abs(input[i] - input[i+1]);
            }
            Thread.sleep(100);
        }
    }

    private static boolean isEveryElementZero(int[] input) {
        for (int i : input) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
