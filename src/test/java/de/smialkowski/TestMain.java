package de.smialkowski;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class TestMain {
    @Test
    public void testInputIsEven() {
        assertTrue(Main.checkIfInputIsAnEvenNumber(22)); // Test einer geraden Zahl, muss True ergeben
        assertFalse(Main.checkIfInputIsAnEvenNumber(23)); // Test einer ungeraden Zahl, muss False ergeben
    }
}
