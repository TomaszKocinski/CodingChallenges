package com.company.codewars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class MaximumSubarraySumTest {

    @Test
    public void testEmptyArray() throws Exception {
        Assert.assertEquals("Empty arrays should have a max of 0", 0, MaximumSubarraySum.sequence(new int[]{}));
    }
    @Test
    public void testExampleArray() throws Exception {
        Assert.assertEquals("Example array should have a max of 6", 6, MaximumSubarraySum.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
    @Test
    public void testExampleArrayRandomFromAttepmt() throws Exception {
        Assert.assertEquals("Random array should have a max of 165", 165, MaximumSubarraySum.sequence(new int[]{18, -10, -10, 28, -7, 29, 1, 14, -10, 1, -9, -3, -16, -15, -11, 4, 11, 1, -6, 26, -12, 4, 11, 6, 0, 16, -15, -12, 28, -20, -1, -18, -5, 0, 8, -29, 22, 23, 20, -19, 29, 27, 5, 25, -24, -11, 16, 25, 19, 8}));
    }
}