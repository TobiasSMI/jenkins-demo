package de.smialkowski;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class TestMain {
    @Test
    public void testInputIsEven() {
        assertTrue(Main.checkIfInputIsAnEvenNumber(22)); // Assertion
        assertTrue(Main.checkIfInputIsAnEvenNumber(23)); // Assertion
    }
}
