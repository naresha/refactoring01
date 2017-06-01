package excercise1;

import java.math.BigDecimal;

/**
 * Created by naresha on 30/05/17.
 */
public class ExtractMethodExercise02 {
    public void calculateInterest() {
        BigDecimal loanAmountOption1 = new BigDecimal("10000");
        BigDecimal loanAmountOption2 = new BigDecimal("50000");
        BigDecimal loanAmountOption3 = new BigDecimal("100000");
        BigDecimal interestForOption1 = loanAmountOption1.multiply(new BigDecimal("0.1"));
        BigDecimal interestForOption2 = loanAmountOption2.multiply(new BigDecimal("0.1"));
        BigDecimal interestForOption3 = loanAmountOption3.multiply(new BigDecimal("0.1"));
        System.out.println(interestForOption1);
        System.out.println(interestForOption2);
        System.out.println(interestForOption3);
    }

    public static void main(String[] args) {
        new ExtractMethodExercise02().calculateInterest();
    }

}
