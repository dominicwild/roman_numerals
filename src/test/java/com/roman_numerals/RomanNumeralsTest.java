package com.roman_numerals;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class RomanNumeralsTest {

    @ParameterizedTest
    @CsvSource({"", ""})
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }

}
