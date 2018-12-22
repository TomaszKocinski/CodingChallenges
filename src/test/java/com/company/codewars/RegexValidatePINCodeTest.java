package com.company.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegexValidatePINCodeTest {

    @Test
    public void validatePin() {
        assertTrue(RegexValidatePINCode.validatePin("1234"));
        assertTrue(RegexValidatePINCode.validatePin("0000"));
        assertTrue(RegexValidatePINCode.validatePin("1111"));
        assertTrue(RegexValidatePINCode.validatePin("123456"));
        assertTrue(RegexValidatePINCode.validatePin("098765"));
        assertTrue(RegexValidatePINCode.validatePin("000000"));
        assertTrue(RegexValidatePINCode.validatePin("090909"));
    }

    @Test
    public void validatePinFalse() {
        assertFalse(RegexValidatePINCode.validatePin("1234a"));
        assertFalse(RegexValidatePINCode.validatePin("12a4"));
        assertFalse(RegexValidatePINCode.validatePin("12a411111"));
        assertFalse(RegexValidatePINCode.validatePin("1234561234"));

    }

}