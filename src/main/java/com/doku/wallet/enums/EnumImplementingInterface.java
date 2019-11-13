package com.doku.wallet.enums;

/**
 * @author robihidayat
 *
 * http://tutorials.jenkov.com/java/enums.html
 */
public enum  EnumImplementingInterface implements EnumInterface{

    FIRST("First Value"),
    SECOND("Second Value");

    private String description;

    EnumImplementingInterface(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
