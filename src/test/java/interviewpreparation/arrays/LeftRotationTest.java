package interviewpreparation.arrays;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Simple test case for {@link LeftRotation} solution
 *
 * @author csantos
 */
public class LeftRotationTest {

    @Test
    public void test_case_0() {
        int[] input = {1, 2, 3, 4, 5};
        int rotations = 4;
        int[] expected = {5, 1, 2, 3, 4};

        assertTrue(Arrays.equals(expected, LeftRotation.rotLeft(input, rotations)));
    }
}
