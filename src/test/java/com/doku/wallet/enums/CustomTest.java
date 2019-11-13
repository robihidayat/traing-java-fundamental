package com.doku.wallet.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author robihidayat
 */
class CustomTest {

    @Test
    void getName() {
        assertEquals("FAILED", Custom.FAILED.name());
    }

    @Test
    void code() {
        assertEquals("9999", Custom.FAILED.code());
    }
}