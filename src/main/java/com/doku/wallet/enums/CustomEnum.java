package com.doku.wallet.enums;

/**
 * @author robihidayat
 */
public enum  CustomEnum {

    SUCCESS("0000"),
    ERROR("9999");

    private String code;

    CustomEnum(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }
}
