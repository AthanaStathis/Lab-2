package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TextProcessorTest {

    TextProcessor textProcessor = new TextProcessor();

    static int countTestSerie = 0;
    static int countTestNumber = 0;
    Calculator calculator = new Calculator();

    @BeforeAll
    static void printBeforeAll() {
        System.out.println("=========  TEXT PROCESSOR , TEST SERIE: " + ++countTestSerie + "  ===========");
    }

    @AfterAll
    static void printAfterAll() {
        System.out.println("-----------------------------------------");
        countTestSerie = 0;
        countTestNumber = 0;
    }

    @BeforeEach
    void printBeforeTest() {
        System.out.println(" Before Test Nr: " + ++countTestNumber);
    }

    @AfterEach
    void printAfterTest() {
        System.out.println(" After Test Nr: " + countTestNumber);
    }

    @Test
    @DisplayName("Test - Upper Case")
    void uppercase() {
        assertEquals("HELLO", textProcessor.stringToUppercase("hello"));
    }

    @Test
    @DisplayName("Test - Lower Case")
    void lowercase() {
        assertEquals("america",textProcessor.stringToLowercase("AmeRicA"));
    }

    @Test
    @DisplayName("Test - Reverse String")
    void reverseString() {
        String testString = textProcessor.reverseString("OMO");
        assertTrue("OMO".equals(testString));
    }

    @Test
    @DisplayName("Test - Null String")
    void isNullString() {
        assertNotNull("America", "");
    }
}