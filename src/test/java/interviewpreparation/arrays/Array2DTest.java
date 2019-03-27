package interviewpreparation.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Simple test case for {@link Array2D} solution
 *
 * @author csantos
 */
public class Array2DTest {

    @Test
    public void test_case_0() {
        int[][] input = {{1, 1, 1, 0, 0, 0},
                         {0, 1, 0, 0, 0, 0},
                         {1, 1, 1, 0, 0, 0},
                         {0, 0, 2, 4, 4, 0},
                         {0, 0, 0, 2, 0, 0},
                         {0, 0, 1, 2, 4, 0}};
        int expected = 19;

        assertEquals(expected, Array2D.hourglassSum(input));
    }
}
