package demo2;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by naresha on 21/06/17.
 */
public class D206SplitTemporaryVariable {
    public void perform() {
        List<Integer> numbers = Arrays.asList(2, 5, 3, 1, 8);
        numbers = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        new D206SplitTemporaryVariable().perform();
    }
}
