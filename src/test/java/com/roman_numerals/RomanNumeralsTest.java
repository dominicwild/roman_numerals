package com.roman_numerals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RomanNumeralsTest {

    @ParameterizedTest
    @CsvSource({
            "1, I",
    })
    void integers_convert_to_correct_roman_numeral(int toConvert, String romanNumeral) {
        assertEquals(romanNumeral, RomanNumerals.convert(toConvert));
    }

}
