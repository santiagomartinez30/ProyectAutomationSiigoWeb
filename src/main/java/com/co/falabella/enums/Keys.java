package com.co.falabella.enums;

public enum Keys {
    KEY1("Precio de articulo");

    private final String value;

    Keys(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
