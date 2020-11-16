package org.example;

public class TextProcessor {
    public String stringToUppercase (String inputString) {
        return inputString.toUpperCase();
    }

    public String stringToLowercase (String inputString) {
        return inputString.toLowerCase();
    }

    public String reverseString(String inputString) {
        StringBuilder intermediate = new StringBuilder(inputString);
        return intermediate.reverse().toString();
    }
}
