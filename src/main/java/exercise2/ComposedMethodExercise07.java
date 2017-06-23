package exercise2;

import java.math.BigDecimal;

/**
 * Split temporary variable
 * Created by naresha on 21/06/17.
 */
public class ComposedMethodExercise07 {

    public void perform() {
        BigDecimal price = new BigDecimal("500");
        price = price.subtract(new BigDecimal("50"));
        price = price.add(price.multiply(new BigDecimal("0.12")));
        System.out.println("Selling price with tax: " + price);
    }

    public static void main(String[] args) {
        new ComposedMethodExercise07().perform();
    }
}
