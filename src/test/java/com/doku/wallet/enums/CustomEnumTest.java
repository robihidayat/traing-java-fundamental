package com.doku.wallet.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author robihidayat
 */
class CustomEnumTest {

    @Test
    void code() {
        assertEquals("9999", CustomEnum.ERROR.code());
        assertEquals("0000", CustomEnum.SUCCESS.code());
    }
}