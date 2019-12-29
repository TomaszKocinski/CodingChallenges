package com.company.codewars;

import org.junit.Assert;
import org.junit.Test;

public class DigitalRootTest {

    @Test
    public void digital_root() {
        Assert.assertEquals(7, DigitalRoot.digital_root(16));
        Assert.assertEquals(2, DigitalRoot.digital_root(56));

    }
}