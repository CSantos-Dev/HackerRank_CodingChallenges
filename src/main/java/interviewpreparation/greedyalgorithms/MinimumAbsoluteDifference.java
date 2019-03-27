package interviewpreparation.greedyalgorithms;

import java.util.Arrays;

/**
 * Minimum Absolute Difference in an Array
 * https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=greedy-algorithms
 *
 * @author csantos
 */
public class MinimumAbsoluteDifference {

    /**
     * Returns the minimum absolute difference between any two elements of the given array
     *
     * Time complexity: O(n)
     */
    static int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);
        int minimumAbsoluteDifference = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int absoluteDifference = Math.abs(arr[i] - arr[i + 1]);
            if(absoluteDifference < minimumAbsoluteDifference) {
                minimumAbsoluteDifference = absoluteDifference;
            }
        }

        return minimumAbsoluteDifference;
    }

}
