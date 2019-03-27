package interviewpreparation.arrays;

/**
 * Arrays: Left Rotation
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 *
 * @author csantos
 */
public class LeftRotation {

    /**
     * Performs X rotations on the given array.
     * Each rotation shift each element of the array one position to the left.
     *
     * Time complexity: O(n)
     *
     * @param arr
     *          the array in which the rotation is performed
     * @param numberOfRotations
     *          the amount of position each element has to be rotated
     */
    static int[] rotLeft(int[] arr, int numberOfRotations) {
        int[] rotatedArray = new int[arr.length];
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            int newPosition = (i + numberOfRotations) % length;
            rotatedArray[i] = arr[newPosition];
        }

        return rotatedArray;
    }
}
