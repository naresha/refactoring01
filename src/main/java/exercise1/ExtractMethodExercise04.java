package exercise1;

import java.util.Arrays;
import java.util.List;

/**
 * Created by naresha on 31/05/17.
 */
public class ExtractMethodExercise04 {

    public void perform() {
        List<Integer> numbers = Arrays.asList(3, 2, 1, 5, 4);
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number * 2;
            }
        }
        System.out.println("Sum of double the even numbers " + sum);
    }

    public static void main(String[] args) {
        new ExtractMethodExercise04().perform();
    }
}
