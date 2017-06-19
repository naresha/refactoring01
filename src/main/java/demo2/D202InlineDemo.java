package demo2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by naresha on 07/06/17.
 */
public class D202InlineDemo {
    public void perform() {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 2, 4, 7, 6);
        int sum = computeSumOfDouble(numbers);
        /*
        int multiplier = 3;
        */
        System.out.println("Sum: " + sum);
    }

    private int computeSumOfDouble(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number * 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        new D202InlineDemo().perform();
    }
}


