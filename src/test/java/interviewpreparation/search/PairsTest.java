package interviewpreparation.search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Simple test case for {@link Pairs} solution
 *
 * @author csantos
 */
public class PairsTest {

    @Test
    public void test_case_0() {
        int[] input = new int[] {1, 5, 3, 4, 2};
        int target = 2;

        assertEquals(3, Pairs.pairs(target, input));
    }
}
