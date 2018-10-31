package com.company.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsEncoderTest {
    private RomanNumeralsEncoder conversion = new RomanNumeralsEncoder();

    @Test
    public void shouldConvertToRoman() {
        assertEquals("solution(1) should equal to I", "I", conversion.solution(1));
        assertEquals("solution(4) should equal to IV", "IV", conversion.solution(4));
        assertEquals("solution(6) should equal to VI", "VI", conversion.solution(6));
    }

    @Test
    public void fromAttempt(){
        assertEquals("solution(89) should equal to LXXXIX", "LXXXIX", conversion.solution(89));
    }

    @Test
    public void justTest(){
        assertEquals("solution(9) should equal to IX", "IX", conversion.solution(9));
        assertEquals("solution(19) should equal to XIX", "XIX", conversion.solution(19));
    }
}