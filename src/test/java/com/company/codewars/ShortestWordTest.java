package com.company.codewars;


import org.junit.Assert;
import org.junit.Test;

public class ShortestWordTest {

    @Test
    public void findShort() {
        Assert.assertEquals(3, ShortestWord.findShort("bitcoin take over the world maybe who knows perhaps"));
        Assert.assertEquals(3, ShortestWord.findShort("turns out random test cases are easier than writing out basic ones"));
    }

    @Test
    public void findShortStream() {
        Assert.assertEquals(3, ShortestWord.findShortStream("bitcoin take over the world maybe who knows perhaps"));
        Assert.assertEquals(3, ShortestWord.findShortStream("turns out random test cases are easier than writing out basic ones"));
    }
}