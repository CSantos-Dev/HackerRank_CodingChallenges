package interviewpreparation.arrays;

/**
 * 2D Array - DS
 * https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 *
 * @author csantos
 */
public class Array2D {

    /**
     * Finds and return the maximum value, result of summing all the values
     * of each subset that follows this pattern for the given array:
     *
     *  1 2 3
     *    4
     *  5 6 7
     *
     * Time complexity: O(n^2)
     *
     */
    static int hourglassSum(int[][] arr) {
        int maximumValue = Integer.MIN_VALUE;
        int currentMax;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr[i].length - 2; j++) {
                currentMax = 0;
                currentMax = updateCurrentMax(arr, i, j, currentMax);
                maximumValue = updateMaximumValue(maximumValue, currentMax);
            }
        }

        return maximumValue;
    }

    private static int updateMaximumValue(int maximumValue, int currentMax) {
        if (currentMax > maximumValue) {
            maximumValue = currentMax;
        }
        return maximumValue;
    }

    private static int updateCurrentMax(int[][] arr, int i, int j, int currentMax) {
        // Sum first row
        currentMax += arr[i][j];
        currentMax += arr[i][j+1];
        currentMax += arr[i][j+2];

        // Sum second row
        currentMax += arr[i+1][j+1];

        // Sum third row
        currentMax += arr[i+2][j];
        currentMax += arr[i+2][j+1];
        currentMax += arr[i+2][j+2];
        return currentMax;
    }
}
