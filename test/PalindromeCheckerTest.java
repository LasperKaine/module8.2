import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    private PalindromeChecker checker;

    @BeforeEach
    void setUp() {
        checker = new PalindromeChecker();
    }

    @Test
    public void testSimplePalindromes() {
        assertTrue(checker.isPalindrome("radar"));
        assertTrue(checker.isPalindrome("level"));
        assertTrue(checker.isPalindrome("madam"));
    }

    @Test
    public void testPalindromeWithMixedCase() {
        assertTrue(checker.isPalindrome("Racecar"));
        assertTrue(checker.isPalindrome("Madam"));
    }

    @Test
    public void testPalindromeWithSpacesAndPunctuation() {
        assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama"));
        assertTrue(checker.isPalindrome("Was it a car or a cat I saw?"));
        assertTrue(checker.isPalindrome("No 'x' in Nixon"));
    }

    @Test
    public void testNonPalindromes() {
        assertFalse(checker.isPalindrome("hello"));
        assertFalse(checker.isPalindrome("openai"));
        assertFalse(checker.isPalindrome("world"));
    }

    @Test
    public void testSingleCharacterAndEmpty() {
        assertTrue(checker.isPalindrome("a"));
        assertTrue(checker.isPalindrome(""));
    }

    @Test
    public void testNumericPalindrome() {
        assertTrue(checker.isPalindrome("12321"));
        assertFalse(checker.isPalindrome("12345"));
    }

    @Test
    public void testIsPalindrome() {
        // The example test cases from the assignment
        assertTrue(checker.isPalindrome("radar"));
        assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama"));
        assertFalse(checker.isPalindrome("hello"));
        assertFalse(checker.isPalindrome("openai"));
    }
}

