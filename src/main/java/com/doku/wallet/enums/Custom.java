package com.doku.wallet.enums;

/**
 * @author robihidayat
 */
public enum  Custom {

    SUCCESS("GOOD", "0000"),
    FAILED("NO", "9999");

    private String name;
    private String code;


    Custom(String name, String code) {
        this.name = name;
        this.code = code;
    }


    public String getName() {
        return name;
    }

    public String code() {
        return code;
    }



}
