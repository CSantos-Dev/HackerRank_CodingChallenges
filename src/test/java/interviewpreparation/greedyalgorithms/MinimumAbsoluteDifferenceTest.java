package interviewpreparation.greedyalgorithms;

import interviewpreparation.hashmaps.RansomNote;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Simple test case for {@link RansomNote} solution
 *
 * @author csantos
 */
public class MinimumAbsoluteDifferenceTest {

    @Test
    public void test_case_0() {
        int[] input = {3, -7, 0};
        assertEquals(3, MinimumAbsoluteDifference.minimumAbsoluteDifference(input));
    }
}
