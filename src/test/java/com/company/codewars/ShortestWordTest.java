package com.company.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestWordTest {

    @Test
    void findShort() {
        assertEquals(3, ShortestWord.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, ShortestWord.findShort("turns out random test cases are easier than writing out basic ones"));
    }

    @Test
    void findShortStream() {
        assertEquals(3, ShortestWord.findShortStream("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, ShortestWord.findShortStream("turns out random test cases are easier than writing out basic ones"));
    }
}