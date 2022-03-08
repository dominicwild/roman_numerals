package com.roman_numerals;

public class RomanNumerals {

    public static String convert(int toConvert) {
        StringBuilder romanNumeral = new StringBuilder();

        for (int i = 0; i < toConvert; i++) {
            romanNumeral.append("I");
        }

        return romanNumeral.toString();
    }

}
