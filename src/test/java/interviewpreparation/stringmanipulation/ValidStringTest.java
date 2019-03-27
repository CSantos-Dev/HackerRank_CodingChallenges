package interviewpreparation.stringmanipulation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Simple test case for {@link ValidString} solution
 *
 * @author csantos
 */
public class ValidStringTest {

    @Test
    public void test_case_0() {
        assertEquals("NO", ValidString.isValid("aabbcd"));
        assertEquals("YES", ValidString.isValid("abbcd"));
    }
}
