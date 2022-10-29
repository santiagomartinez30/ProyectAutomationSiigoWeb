package com.co.falabella.utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class FomatValue {

    private FomatValue() {
    }

    public static String longValue(long value) {
        DecimalFormat format = new DecimalFormat("###,###.##", DecimalFormatSymbols.getInstance(new Locale("es", "COL")));
        return format.format(value);
    }
}
