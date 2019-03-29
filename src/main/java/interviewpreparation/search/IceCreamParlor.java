package interviewpreparation.search;

import java.util.HashMap;
import java.util.Map;

/**
 * Hash Tables: Ice Cream Parlor
 * https://www.hackerrank.com/challenges/ctci-ice-cream-parlor/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=search
 *
 * @author csantos
 */
public class IceCreamParlor {

    /**
     * For the given amount of money and array of costs, find the indexes of the two cost values
     * that we can pick in order to spend the whole amount of money.
     * (The array is 1-index based)
     * There will be always a solution.
     *
     * Time complexity: O(n) since HashMap operations takes constant time
     *
     * @param money
     *      the available amount of money that we can spend
     * @param cost
     *      array of cost values
     *
     */
    static int[] whatFlavors(int[] cost, int money) {
        Map<Integer, Integer> costIndexes = new HashMap<>();

        for (int i = 0; i < cost.length; i++) {
            int complement = money - cost[i];
            if (costIndexes.containsKey(complement)) {
                return new int[] {costIndexes.get(complement) + 1, i + 1};
            }

            costIndexes.put(cost[i], i);
        }

        return null;
    }
}
