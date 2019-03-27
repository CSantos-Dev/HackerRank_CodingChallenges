package interviewpreparation.stringmanipulation;

import java.util.HashMap;
import java.util.Map;

/**
 * Sherlock and Valid String
 * https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 *
 * @author csantos
 */
public class ValidString {

    /**
     * Returns whether the given String is valid or not.
     * It is valid if all the characters of the String appear the same amount of times.
     * It is also valid if we can remove one character and the remaining characters
     * will occur the same number of times.
     *
     * Time complexity: O(n) since there are no nested loops and HashMap operations takes constant time
     */
    static String isValid(String s) {
        boolean isValid = false;
        // Keeps track of each character of the String, and the amount of times that this character is repeated
        Map<Character, Integer> characters = new HashMap<>();
        // Stores the character as Integer (amount of times the character is repeated) as key
        // and the amount of times this value is repeated as value (So We know how many different character appears
        // different amount of times.
        Map<Integer, Integer> repeatedCharacters = new HashMap<>();

        for(char c : s.toCharArray()) {
            characters.merge(c, 1, Integer::sum);
        }

        for (Integer i : characters.values()) {
            repeatedCharacters.merge(i, 1, Integer::sum);
        }

        if (repeatedCharacters.size() == 1) {
            // All characters appear the same amount of times
            isValid = true;
        } else if (repeatedCharacters.size() == 2 && repeatedCharacters.containsValue(1)) {
            // There is one character that appears a different amount of times than the others
            Integer singleCharacter = null;
            Integer others = null;
            for(Integer amount : repeatedCharacters.keySet()) {
                if (repeatedCharacters.get(amount) == 1) {
                    singleCharacter = amount;
                } else {
                    others = amount;
                }
            }

            if (singleCharacter - 1 == 0 || singleCharacter - 1 == others) {
                // There is a character that appears only once or there is one character that appear one more time
                // than the remaining characters. In both cases we can remove one character so the rest will appear the
                // same amount of times
                isValid = true;
            }
        }

        if (isValid) {
            return "YES";
        } else {
            return "NO";
        }

    }
}
