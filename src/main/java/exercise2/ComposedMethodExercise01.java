package exercise2;

import java.util.ArrayList;
import java.util.List;

/**
 * Inline exercise
 * Created by naresha on 05/06/17.
 */
public class ComposedMethodExercise01 {

    public void perform() {
        String sentence = "Refactoring is a power tool for the developers";
        String[] words = splitIntoWords(sentence);
        System.out.println("Words: ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public String[] splitIntoWords(String sentence) {
        List<String> words = new ArrayList<>();
        char[] letters = sentence.toCharArray();
        int begin = 0;
        int end = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == ' ' || i == letters.length - 1) {
                words.add(sentence.substring(begin, end));
                begin = i + 1;
            }
            end++;
        }
        return words.toArray(new String[words.size()]);
    }

    public static void main(String[] args) {
        new ComposedMethodExercise01().perform();
    }
}
