package interviewpreparation.hashmaps;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * Hash Tables: Ransom Note
 * https://www.hackerrank.com/challenges/ctci-ransom-note/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
 *
 * @author csantos
 */
public class RansomNote {

    /**
     * Returns whether the given note can be written using only the available words
     * in the array magazine or not
     *
     * All the words in the magazine are added to a HashMap which contains the word as key
     * and the amount of times that word appears as value. Then I check whether each of the words
     * in the note can be found in the HashMap.
     *
     * Note: The original solution ask to print "Yes" or "No" instead of returning a boolean.
     *
     * Time complexity: O(n) since HashMap operations takes constant time.
     *
     * @param magazine
     *          the array containing the available words
     * @param note
     *          the array containing the note we want to write
     */
    static boolean checkMagazine(String[] magazine, String[] note) {
        Map<String, Long> magazineWords = Arrays.stream(magazine)
                .collect(groupingBy(Function.identity(), counting()));

        for(String word : note) {
            if (magazineWords.containsKey(word)) {
                magazineWords.put(word, magazineWords.get(word) - 1);
            } else {
                return false;
            }

            if(magazineWords.get(word) == 0) {
                magazineWords.remove(word);
            }
        }

        return true;
    }
}
