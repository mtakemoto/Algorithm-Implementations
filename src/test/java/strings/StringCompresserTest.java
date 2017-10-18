package strings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCompresserTest {
    private StringCompresser testClass;

    @Before
    public void initializeClass() throws Exception {
        testClass = new StringCompresser();
    }

    @Test
    public void handlesNull() throws Exception {
        assertEquals(null, testClass.runAllSolutions(null));
    }

    @Test
    public void handlesSingleLetter() throws Exception {
        String singleLetter = "a";
        assertEquals(singleLetter, testClass.runAllSolutions(singleLetter));
    }

    @Test
    public void handlesSmallInput() throws Exception {
        String inputSmallerThan = "abc";
        assertEquals(inputSmallerThan, testClass.runAllSolutions(inputSmallerThan));
    }

    @Test
    public void handlesEqualInput() throws Exception {
        String inputEqualTo = "aabbcc";
        assertEquals(inputEqualTo, testClass.runAllSolutions(inputEqualTo));
    }

    @Test
    public void compressesCorrectly() throws Exception {
        String inputGreaterThan = "aaabbbcdddd";
        String inputGreaterThanExpected = "a3b3c1d4";
        assertEquals(inputGreaterThanExpected, testClass.runAllSolutions(inputGreaterThan));
    }

    @Test
    public void compressesMixedCaps() throws Exception {
        String mixedCaps = "AAAAUGhhhhhh";
        String mixedCapsExpected = "A4U1G1h6";
        assertEquals(mixedCapsExpected, testClass.runAllSolutions(mixedCaps));
    }

}