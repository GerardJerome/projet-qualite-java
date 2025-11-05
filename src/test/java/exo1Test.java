import com.example.tp1.Tp1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class exo1Test {

    @Test
    void testIsPalindromeSimple() {
        assertTrue(Tp1.isPalindrome("kayak"));
        assertTrue(Tp1.isPalindrome("madam"));
    }

    @Test
    void testIsPalindromeWithSpacesAndCase() {
        assertTrue(Tp1.isPalindrome("A man a plan a canal Panama"));
        assertTrue(Tp1.isPalindrome("No lemon no melon"));
    }

    @Test
    void testIsPalindromeFalse() {
        assertFalse(Tp1.isPalindrome("bonjour"));
        assertFalse(Tp1.isPalindrome("palindrome"));
    }

    @Test
    void testIsPalindromeEmptyOrNull() {
        assertTrue(Tp1.isPalindrome("")); // vide = palindrome
        assertFalse(Tp1.isPalindrome(null)); // null non accepté
    }

    // --- Tests pour countVowels ---

    @Test
    void testCountVowelsBasic() {
        assertEquals(3, Tp1.countVowels("bonjour"));
        assertEquals(1, Tp1.countVowels("chat"));
        assertEquals(2, Tp1.countVowels("rhythme"));
    }

    @Test
    void testCountVowelsWithUppercase() {
        assertEquals(5, Tp1.countVowels("AEIOU"));
        assertEquals(5, Tp1.countVowels("aeiou"));
    }

    @Test
    void testCountVowelsEmptyOrNull() {
        assertEquals(0, Tp1.countVowels(""));
        assertEquals(0, Tp1.countVowels(null));
    }

    // --- Tests pour reverse ---

    @Test
    void testReverseBasic() {
        assertEquals("cba", Tp1.reverse("abc"));
        assertEquals("321", Tp1.reverse("123"));
    }

    @Test
    void testReversePalindrome() {
        assertEquals("kayak", Tp1.reverse("kayak"));
    }

    @Test
    void testReverseEmptyOrNull() {
        assertEquals("", Tp1.reverse(""));
        assertNull(Tp1.reverse(null));
    }
}
