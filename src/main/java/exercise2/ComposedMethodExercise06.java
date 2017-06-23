package exercise2;

import java.math.BigDecimal;

/**
 * Introduce explaining variable
 * Created by naresha on 08/06/17.
 */
public class ComposedMethodExercise06 {
    public void determineSalary() {
        BigDecimal amount = new BigDecimal("25000");
        amount = amount.subtract(new BigDecimal("200"));
        System.out.println("Net Salary: " + amount);
    }

    public static void main(String[] args) {
        new ComposedMethodExercise06().determineSalary();
    }
}
