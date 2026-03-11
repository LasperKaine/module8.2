import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorTest {

    private StringManipulator manipulator;

    @BeforeEach
    void setUp() {
        manipulator = new StringManipulator();
    }

    @Test
    void testConcatenate() {
        assertEquals("SlyCooper", manipulator.concatenate("Sly", "Cooper"));
        assertEquals("Bentley", manipulator.concatenate("Bentley", ""));
        assertEquals("Murray", manipulator.concatenate("", "Murray"));
        assertEquals("", manipulator.concatenate("", ""));
    }

    @Test
    void testFindLength() {
        assertEquals(10, manipulator.findLength("Sly Cooper"));
        assertEquals(0, manipulator.findLength(""));
        assertEquals(18, manipulator.findLength("Thievius Raccoonus"));
        assertEquals(7, manipulator.findLength("Bentley"));
    }

    @Test
    void testConvertToUpperCase() {
        assertEquals("SLY COOPER", manipulator.convertToUpperCase("sly cooper"));
        assertEquals("CLOCKWERK", manipulator.convertToUpperCase("Clockwerk"));
        assertEquals("MURRAY", manipulator.convertToUpperCase("MURRAY"));
        assertEquals("", manipulator.convertToUpperCase(""));
    }

    @Test
    void testConvertToLowerCase() {
        assertEquals("sly cooper", manipulator.convertToLowerCase("SLY COOPER"));
        assertEquals("carmelita fox", manipulator.convertToLowerCase("Carmelita Fox"));
        assertEquals("bentley", manipulator.convertToLowerCase("bentley"));
        assertEquals("", manipulator.convertToLowerCase(""));
    }

    @Test
    void testContainsSubstring() {
        assertTrue(manipulator.containsSubstring("Sly Cooper", "Cooper"));
        assertTrue(manipulator.containsSubstring("Sly Cooper", "Sly"));
        assertTrue(manipulator.containsSubstring("Sly Cooper", " "));
        assertFalse(manipulator.containsSubstring("Sly Cooper", "cooper"));
        assertFalse(manipulator.containsSubstring("Bentley", "Bentley the Turtle"));
        assertTrue(manipulator.containsSubstring("Murray", ""));
    }
}

