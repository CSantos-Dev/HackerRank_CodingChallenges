package interviewpreparation.stringmanipulation;

/**
 * Alternating Characters
 * https://www.hackerrank.com/challenges/alternating-characters/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 *
 * @author csantos
 */
public class AlternatingCharacters {

    /**
     * Return the number of characters that has to be removed in the given String so that
     * this String has no matching adjacent characters.
     *
     * Time complexity: O(n)
     */
    static int alternatingCharacters(String s) {
        int deletions = 0;

        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == s.charAt(i + 1)) {
                deletions++;
            }
        }

        return deletions;
    }


}
