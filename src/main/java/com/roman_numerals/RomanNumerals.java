package com.roman_numerals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RomanNumerals {

    public static String convert(int number) {
        StringBuilder romanNumeralBuilder = new StringBuilder();
        int remaining = number;

        for (RomanNumeral romanNumeral : RomanNumeral.getInDescendingOrder()) {
            int numberOfTimesToRepeat = remaining / romanNumeral.getValue();
            
            String romanNumeralSymbol = romanNumeral.getSymbol();
            romanNumeralBuilder.append(romanNumeralSymbol.repeat(numberOfTimesToRepeat));
            
            remaining = remaining % romanNumeral.getValue();
        }

        return romanNumeralBuilder.toString();
    }

    enum RomanNumeral {
        I(1),
        IV(4),
        V(5),
        IX(9),
        XL(40),
        XC(90),
        X(10),
        L(50),
        C(100),
        CD(400),
        D(500),
        CM(900),
        M(1000);

        private final int value;

        RomanNumeral(int value) {
            this.value = value;
        }

        public String getSymbol() {
            return this + "";
        }

        public static List<RomanNumeral> getInDescendingOrder() {
            List<RomanNumeral> numerals = new ArrayList<>(Arrays.asList(RomanNumeral.values()));
            numerals.sort(inDescendingOrder());
            return numerals;
        }

        private static Comparator<? super RomanNumeral> inDescendingOrder() {
            return (romanNumeral, toCompare) -> toCompare.getValue() - romanNumeral.getValue();
        }

        public int getValue() {
            return value;
        }
    }

}
