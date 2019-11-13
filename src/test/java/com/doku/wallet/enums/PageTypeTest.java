package com.doku.wallet.enums;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @author robihidayat
 */
class PageTypeTest {

    @Test
    void valueOf() {
        PageType pageType = PageType.valueOf(2);
        assertEquals(2, pageType.getValue());
    }

    @Test
    void getValue() {
        PageType pageType = PageType.valueOf(2);
        assertEquals(PageType.CODING, pageType);
    }


}