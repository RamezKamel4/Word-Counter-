package com.example.wordcounter2ramezkameljava;

public class TextUtilis {
    public static int getCharsCount(String input) {
        return input.length();
    }

    public static int getWordsCount(String input) {
        String[] words = input.split("\\s+"); // Split the input string by whitespace
        return words.length;
    }
}
