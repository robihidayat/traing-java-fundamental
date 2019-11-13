package com.doku.wallet.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author robihidayat
 */

class SimpleEnumsTest {


    @Test
    void getName() {
        assertEquals("STANDARD", SimpleEnums.STANDARD.name());
        assertEquals("BLOCK", SimpleEnums.BLOCK.name());
        assertEquals("PREMIUM", SimpleEnums.PREMIUM.name());
    }

    @Test
    void getInt(){
        assertEquals(0, SimpleEnums.PREMIUM.ordinal());
        assertEquals(1, SimpleEnums.BLOCK.ordinal());
        assertEquals(2, SimpleEnums.STANDARD.ordinal());
    }

}