package exercise2;

import java.math.BigDecimal;

/**
 * Inline temp
 * Created by naresha on 07/06/17.
 */
public class ComposedMethodExercise04 {
    public void perform() {
        BigDecimal principal = new BigDecimal(100000);
        BigDecimal temp = interest(principal);
        BigDecimal amountPayable = principal.add(temp);
        System.out.println("Payable : " + amountPayable);
    }

    public BigDecimal interest(BigDecimal principal) {
        return principal.multiply(new BigDecimal(".12"));
    }

    public static void main(String[] args) {
        new ComposedMethodExercise04().perform();
    }
}
