package interviewpreparation.search;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Simple test case for {@link IceCreamParlor} solution
 *
 * @author csantos
 */
public class IceCreamParlorTest {

    @Test
    public void test_case_0() {
        int money = 4;
        int[] input = new int[] {1, 4, 5, 3, 2};
        int[] expected = new int[] {1, 4};

        assertTrue(Arrays.equals(expected, IceCreamParlor.whatFlavors(input, money)));
    }
}
