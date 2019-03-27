package interviewpreparation.hashmaps;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Simple test case for {@link TwoStrings} solution
 *
 * @author csantos
 */
public class TwoStringsTest {

    @Test
    public void test_case_0() {
        assertEquals("YES", TwoStrings.twoStrings("hello","world"));
        assertEquals("NO", TwoStrings.twoStrings("hi","world"));
        assertEquals("YES", TwoStrings.twoStringsAlternative("hello","world"));
        assertEquals("NO", TwoStrings.twoStringsAlternative("hi","world"));
    }
}
