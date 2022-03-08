package com.roman_numerals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RomanNumeralsTest {

    @ParameterizedTest
    @CsvSource({
            "1, I",
            "2, II",
            "3, III",
            "5, V",
            "6, VI",
            "7, VII",
            "8, VIII",
            "10, X",
            "11, XI",
            "12, XII",
            "15, XV",
            "16, XVI",
            "50, L",
    })
    void integers_convert_to_correct_roman_numeral(int toConvert, String romanNumeral) {
        assertEquals(romanNumeral, RomanNumerals.convert(toConvert));
    }

}
