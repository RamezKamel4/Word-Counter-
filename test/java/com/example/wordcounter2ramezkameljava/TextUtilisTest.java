package com.example.wordcounter2ramezkameljava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class TextUtilisTest {

    @Test
    public void testGetCharsCount() {
        // Test a string with various characters
        String testString = "Hello, this is a test string!";
        int charCount = TextUtilis.getCharsCount(testString);
        assertEquals(30, charCount);
    }

    @Test
    public void testGetWordsCount() {
        // Test a string with multiple words
        String testString = "Hello, this is a test string!";
        int wordCount = TextUtilis.getWordsCount(testString);
        assertEquals(6, wordCount);
    }

    @Test
    public void testGetCharsCount_EmptyString() {
        // Test an empty string
        String testString = "";
        int charCount = TextUtilis.getCharsCount(testString);
        assertEquals(0, charCount);
    }

    @Test
    public void testGetWordsCount_EmptyString() {
        // Test an empty string
        String testString = "";
        int wordCount = TextUtilis.getWordsCount(testString);
        assertEquals(0, wordCount);
    }

    @Test
    public void testGetWordsCount_NullInput() {
        // Test null input
        String testString = null;
        int wordCount = TextUtilis.getWordsCount(testString);
        assertEquals(0, wordCount);
    }
}
