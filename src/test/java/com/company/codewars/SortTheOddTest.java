package com.company.codewars;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortTheOddTest {

    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, SortTheOdd.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 }, SortTheOdd.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }

    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{}, SortTheOdd.sortArray(new int[]{}));
    }

    @Test
    public void exampleTest4() {
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10}, SortTheOdd.sortArray(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }

    @Test
    public void exampleTest5() {
        assertArrayEquals(new int[]{10,1,8,3,6,5,4,7,2,9}, SortTheOdd.sortArray(new int[]{10,9,8,7,6,5,4,3,2,1}));
    }

}