package interviewpreparation.hashmaps;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Simple test case for {@link RansomNote} solution
 *
 * @author csantos
 */
public class RansomNoteTest {

    @Test
    public void test_case_0() {
        String[] magazine = {"give", "me", "one", "grand", "today", "night"};
        String[] note = {"give", "one", "grand", "today"};

        assertTrue(RansomNote.checkMagazine(magazine, note));
    }
}
