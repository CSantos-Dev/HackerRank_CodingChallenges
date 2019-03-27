package interviewpreparation.hashmaps;

import java.util.HashSet;
import java.util.Set;

/**
 * Two Strings
 * https://www.hackerrank.com/challenges/two-strings/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
 *
 * @author csantos
 */
public class TwoStrings {

    /**
     * Check whether the given Strings share a common substring (one character is enough) or not
     * Returns "YES" or "NO".
     *
     * Time complexity: O(n) since HashSet operations takes constant time
     */
    static String twoStrings(String s1, String s2) {
        Set<Character> characters = new HashSet<>();
        for (char c : s1.toCharArray()) {
            characters.add(c);
        }

        for (char c : s2.toCharArray()) {
            if (characters.contains(c)) {
                return "YES";
            }
        }

        return "NO";
    }


    /**
     * Alternative solution with better performance, in case we know the Strings contain only
     * the following characters: 'abcdefghijklmnopqrstuvwxyz'
     * It works for all HackerRank test cases.
     */
    static String twoStringsAlternative(String s1, String s2) {
        char[] characters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (char c : characters) {
            if(s1.indexOf(c) != -1 && s2.indexOf(c) != -1) {
                return "YES";
            }
        }
        return "NO";
    }
}
