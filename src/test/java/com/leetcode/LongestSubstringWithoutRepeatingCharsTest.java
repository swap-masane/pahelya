package com.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;


class LongestSubstringWithoutRepeatingCharsTest {

    @ParameterizedTest(name = "Longest Substring in {0} is {1} ")
    @CsvSource({
            "abcaabbcc,3",
            "pwwkew, 3",
            "aba,2"
    })
    @DisplayName("Longest SubString {}")
    void testLongestSubString(String input, int expectedResult) {
        LongestSubstringWithoutRepeatingChars solution = new LongestSubstringWithoutRepeatingChars();
     //   assertEquals(expectedResult,  solution.lengthOfLongestSubstring(input));
        assertEquals(expectedResult,  solution.lengthOfLongestSubString(input));


    }


}