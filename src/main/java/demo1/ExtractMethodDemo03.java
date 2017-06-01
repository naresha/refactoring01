package demo1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Extract method refactoring involving dependency on variables - return value
 * Created by naresha on 30/05/17.
 */
public class ExtractMethodDemo03 {
    public void printSum() {
        int sum = 0;
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Iterator<Integer> numberIterator = numbers.iterator();
        for (; numberIterator.hasNext(); ) {
            sum += numberIterator.next();
        }
        System.out.println("=============================");
        System.out.println("Sum: " + sum);
        System.out.println("=============================");
    }

    public static void main(String[] args) {
        new ExtractMethodDemo03().printSum();
    }
}
