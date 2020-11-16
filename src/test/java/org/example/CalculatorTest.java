package org.example;

import org.example.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    static int countTestSerie = 0;
    static int countTestNumber = 0;
    Calculator calculator = new Calculator();

    @BeforeAll
    static void printBeforeAll() {
        System.out.println("=========  CALCULATOR , TEST SERIE: " + ++countTestSerie + "  ===========");
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



    @RepeatedTest(3)
    @DisplayName("Test - Addition")
    void testAdd() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    @DisplayName("Test - Subtraction")
    void testSubtract() {
        assertEquals(2,calculator.subtract(4,2));
    }

    @Test
    @DisplayName("Test - Multiplication")
    void testMultiplication() {
        assertEquals(6,calculator.multiply(2,3));
    }

    @Disabled(value = "DISABLED TEST: Division")
    @Test
    @DisplayName("Test - Division")
    void testDivision() {
        assertEquals(3,calculator.divide(6,2));
    }

}