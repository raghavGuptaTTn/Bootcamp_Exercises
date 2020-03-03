package com.im;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {

    static First first;

    @BeforeAll
    static void initializeObject(){
        first = new First();
    }

//    @ParameterizedTest(name = "testString={0}, result={1}")
//    @CsvSource(value = {" "malayalam", 1.72", "95.0, 1.75", "110.0, 1.78"})
//    ========= DOUBT - HOW TO GIVE THESE VALUES FOT STRING ===================================================

    @Nested
    class PalindromeTests {
    // ----------------- TESTS FOR THE PALINDROME FUNCTION -------------------

        @Test
        void should_ReturnTrue_When_StringIsPalindrome() {

            // given
            String test = "malayalam";

            // when
            boolean isPalindrome = first.isPallindrome(test);

            // then
            assertTrue(isPalindrome);
        }

        @Test
        void should_ReturnFalse_When_StringIsNotPalindrome() {

            // given
            String test = "raghav";

            // when
            boolean isPalindrome = first.isPallindrome(test);

            // then
            assertFalse(isPalindrome);
        }

        @Test
        void should_ReturnFalse_When_StringIsEmpty() {

            // given
            String test = "";

            // when
            boolean isPalindrome = first.isPallindrome(test);

            // then
            assertTrue(isPalindrome);
        }

    }


    @Nested
    class CalculateAverageTests {
        // ----------------- TESTS FOR THE calculate average method -------------------
        @Test
        void should_ThrowException_When_ListIsEmpty() {

            //given
            List<BigDecimal> list = new ArrayList<>();

            //when
            Executable executable = () -> first.calculateAverage(list);

            //then
            assertThrows(RuntimeException.class, executable);
        }

        @Test
        void should_ThrowException_When_ListIsNull() {

            //given
            List<BigDecimal> list = null;

            //when
            Executable executable = () -> first.calculateAverage(list);

            //then
            assertThrows(RuntimeException.class, executable);
        }

        @Test
        void should_ReturnCorrectAverage_When_ListIsNotEmpty() {

            //given
            List<BigDecimal> list = new ArrayList<>();
            list.add(new BigDecimal(111111));
            list.add(new BigDecimal(222222));
            list.add(new BigDecimal(333333));
            list.add(new BigDecimal(444444));
            list.add(new BigDecimal(555555));

            BigDecimal answer = new BigDecimal(333333);

            //when
            BigDecimal average = first.calculateAverage(list);

            //then
            assertEquals(average, answer);
        }

    }


    @Nested
    class TestsForFilteringElementsMethod {

        @Test
        void should_ReturnCorrectFilteredList_When_ListNotEmpty() {
            // given
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                list.add(i);
            }

            List<Integer> expectedList = list
                    .stream()
                    .filter(e -> e % 2 == 1)
                    .collect(Collectors.toList());

            // when
            List<Integer> answerList = first.filterEvenElements(list);

            // then
            assertEquals(expectedList, answerList);
        }

    }


    @Nested
    class TestsForStringReplacement {

        @Test
        void should_ReturnMainString_When_SubstringIsNull() {
            // given
            String mainString = "the sun rises in the east";
            String subString = null;
            String replacedString = "THE";
            String expectedString = new String(mainString);

            // when
            String answerString = first.replaceSubString(mainString, subString, replacedString);

            // then
            assertEquals(answerString, expectedString);
        }

        @Test
        void should_ReturnMainString_When_ReplacedStringIsNull() {
            // given
            String mainString = "the sun rises in the east";
            String subString = "the";
            String replacedString = null;
            String expectedString = new String(mainString);

            // when
            String answerString = first.replaceSubString(mainString, subString, replacedString);

            // then
            assertEquals(answerString, expectedString);
        }

        @Test
        void should_ReturnMainString_When_SubstringNotFound() {
            // given
            String mainString = "the sun rises in the east";
            String subString = "his";
            String replacedString = "HIS";
            String expectedString = new String(mainString);

            // when
            String answerString = first.replaceSubString(mainString, subString, replacedString);

            // then
            assertEquals(answerString, expectedString);
        }

        @Test
        void should_ReturnMainString_When_MainStringIsEmpty() {
            // given
            String mainString = "";
            String subString = "the";
            String replacedString = "THE";
            String expectedString = new String(mainString);

            // when
            String answerString = first.replaceSubString(mainString, subString, replacedString);

            // then
            assertEquals(answerString, expectedString);
        }

        @Test
        void should_ReturnUpdatedString_When_SubstringFound() {
            // given
            String mainString = "the sun rises in the east";
            String subString = "the";
            String replacedString = "THE";
            String expectedString = "THE sun rises in THE east";


            // when
            String answerString = first.replaceSubString(mainString, subString, replacedString);
            System.out.println(answerString);

            // then
            assertEquals(answerString, expectedString);
        }

    }


}