package interviewpreparation.search;

import java.util.HashSet;
import java.util.Set;

/**
 * Pairs
 * https://www.hackerrank.com/challenges/pairs/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=search
 *
 * @author csantos
 */
public class Pairs {

    private static int numberOfPairs = 0;

    /**
     * Find and return the number of pairs of the given array that have a
     * difference equal to a target value.
     *
     * Pairs can be found by searching for the complement of every value of the array.
     * The complement can be calculated summing or deducting the target value to the elements of the array.
     *
     * Time complexity: O(n) since HashSet operations takes constant time
     *
     */
    static int pairs(int k, int[] arr) {
        Set<Integer> complements = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > k) {
                updatePairIfComplementFound(complements, arr[i] - k);
                updatePairIfComplementFound(complements, arr[i] + k);
            } else {
                updatePairIfComplementFound(complements, arr[i] + k);
            }

            complements.add(arr[i]);
        }

        return numberOfPairs;
    }

    private static void updatePairIfComplementFound(Set<Integer> complements, int complement) {
        if (complements.contains(complement)) {
            numberOfPairs++;
        }
    }
}
