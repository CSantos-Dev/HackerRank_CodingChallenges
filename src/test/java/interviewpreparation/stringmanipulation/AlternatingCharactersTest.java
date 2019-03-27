package interviewpreparation.stringmanipulation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Simple test case for {@link AlternatingCharacters} solution
 *
 * @author csantos
 */
public class AlternatingCharactersTest {

    @Test
    public void test_case_0() {
        assertEquals(3, AlternatingCharacters.alternatingCharacters("AAAA"));
        assertEquals(4, AlternatingCharacters.alternatingCharacters("BBBBB"));
        assertEquals(0, AlternatingCharacters.alternatingCharacters("ABABABAB"));
        assertEquals(0, AlternatingCharacters.alternatingCharacters("BABABA"));
        assertEquals(4, AlternatingCharacters.alternatingCharacters("AAABBB"));
    }
}
