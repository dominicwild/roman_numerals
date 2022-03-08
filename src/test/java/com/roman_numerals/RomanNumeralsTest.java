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
            "100, C",
            "101, CI",
            "150, CL",
            "500, D",
            "501, DI",
            "570, DLXX",
            "1000, M",
            "1001, MI",
            "1070, MLXX",
            "2000, MM",
            "4, IV",
            "9, IX",
            "40, XL",
            "90, XC",
            "400, CD",
            "900, CM",
    })
    void integers_convert_to_correct_roman_numeral(int toConvert, String romanNumeral) {
        assertEquals(romanNumeral, RomanNumerals.convert(toConvert));
    }

}
