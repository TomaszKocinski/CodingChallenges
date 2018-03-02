package com.company.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitalRootTest {

    @Test
    void digital_root() {
        assertEquals(7, DigitalRoot.digital_root(16));
        assertEquals(2, DigitalRoot.digital_root(56));

    }
}