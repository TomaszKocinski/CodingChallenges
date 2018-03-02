package com.company.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BreakingChocolateProblemTest {

    @Test
    void breakChocolate() {
        assertEquals(24 , BreakingChocolateProblem.breakChocolate(5, 5));
        assertEquals(0 , BreakingChocolateProblem.breakChocolate(1, 1));
    }
}