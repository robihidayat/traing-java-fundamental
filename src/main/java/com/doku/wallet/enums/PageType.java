package com.doku.wallet.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * @author robihidayat
 */
public enum PageType {

    ABOUT(1),
    CODING(2),
    DATABASES(3);

    private int value;
    private static Map map = new HashMap<>();

    PageType(int value) {
        this.value = value;
    }

    static {
        for (PageType pageType : PageType.values()) {

            map.put(pageType.value, pageType);
        }
    }

    public static PageType valueOf(int pageType) {
        return (PageType) map.get(pageType);
    }

    public int getValue() {
        return value;
    }
}
