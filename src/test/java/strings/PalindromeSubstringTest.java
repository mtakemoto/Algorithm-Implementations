package strings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeSubstringTest {
    String singleChar = "a";
    String palindrome = "aba";
    String longPalindrome = "deleveled";
    String notPalindrome = "xyz";
    private PalindromeSubstring testClass;

    @Before
    public void initializeClass() throws Exception {
        testClass = new PalindromeSubstring();
    }

    @Test
    public void palindromeDetected() throws Exception {
        assertEquals(true, testClass.isPalindrome(longPalindrome));
    }

    @Test
    public void palindromeNotDetected() throws Exception {
        assertEquals(false, testClass.isPalindrome(notPalindrome));
    }

    @Test
    public void solutionNull() throws Exception {
        assertEquals(null, testClass.solution(null));
    }

    @Test
    public void solutionSingleChar() throws Exception {
        assertEquals(singleChar, testClass.solution(singleChar));
    }

    @Test
    public void solutionBeginning() throws Exception {
        String s = palindrome + notPalindrome;
        assertEquals(palindrome, testClass.solution(s));
    }

    @Test
    public void solutionEnd() throws Exception {
        String s = notPalindrome + palindrome;
        assertEquals(palindrome, testClass.solution(s));
    }

    @Test
    public void solutionMiddle() throws Exception {
        String s = notPalindrome + palindrome + notPalindrome;
        assertEquals(palindrome, testClass.solution(s));
    }

    @Test
    public void solutionNone() throws Exception {
        String s = "" + notPalindrome.charAt(0);
        assertEquals(s, testClass.solution(notPalindrome));
    }

}