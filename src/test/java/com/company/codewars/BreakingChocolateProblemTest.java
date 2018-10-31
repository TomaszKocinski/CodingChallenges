package com.company.codewars;

import org.junit.Assert;
import org.junit.Test;


class BreakingChocolateProblemTest {

    @Test
    void breakChocolate() {
        Assert.assertEquals(24 , BreakingChocolateProblem.breakChocolate(5, 5));
        Assert.assertEquals(0 , BreakingChocolateProblem.breakChocolate(1, 1));
    }
}