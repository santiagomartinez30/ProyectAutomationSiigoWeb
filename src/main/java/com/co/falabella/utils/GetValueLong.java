package com.co.falabella.utils;

public class GetValueLong {

    private GetValueLong() {
    }

    public static long ofaString(String value) {
        char[] valuediv = value.toCharArray();
        StringBuilder valueNumeric = new StringBuilder();
        for (char c : valuediv) {
            if (Character.isDigit(c)) {
                valueNumeric.append(c);
            }
        }
        return Long.parseLong(valueNumeric.toString());
    }
}
