package com.doku.wallet.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author robihidayat
 */
class EnumImplementingInterfaceTest {

    @Test
    void getDescription() {
        assertEquals("First Value", EnumImplementingInterface.FIRST.getDescription());
        assertEquals("Second Value", EnumImplementingInterface.SECOND.getDescription());

    }
}