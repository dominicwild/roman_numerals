package com.roman_numerals;

public class RomanNumerals {

    public static String convert(int toConvert) {
        StringBuilder romanNumeralBuilder = new StringBuilder();

        for (int i = 0; i < toConvert; i++) {
            romanNumeralBuilder.append("I");
        }

        String romanNumeralString = romanNumeralBuilder.toString();
        for (RomanNumeral romanNumeral : RomanNumeral.values()) {
            romanNumeralString = romanNumeral.replace(romanNumeralString);
        }

        return romanNumeralString;
    }

    enum RomanNumeral {
        V("IIIII", "V"),
        X("VV", "X"),
        L("XXXXX", "L");

        private final String romanNumeral;
        private final String replacement;

        RomanNumeral(String romanNumeral, String replacement) {
            this.romanNumeral = romanNumeral;
            this.replacement = replacement;
        }

        public String replace(String romanNumeral) {
            return romanNumeral.replace(this.romanNumeral, this.replacement);
        }
    }

}
