package com.company.codewars;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


import static org.junit.Assert.*;

public class NumberFunTest {
    @Test
    public void test1() {
        assertEquals(144, NumberFun.findNextSquare(121));
    }

    @Test
    public void test2() {
        assertEquals(676, NumberFun.findNextSquare(625));
    }

    @Test
    public void test3() {
        assertEquals(-1, NumberFun.findNextSquare(114));
    }
}