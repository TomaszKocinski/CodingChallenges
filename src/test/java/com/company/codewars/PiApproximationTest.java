package com.company.codewars;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PiApproximationTest {
    @Test
    public void test1() {
        String res1 = "[10, 3.0418396189]";
        String res2 = PiApproximation.iterPi2String(0.1);
        assertEquals(res1, res2);
    }
}