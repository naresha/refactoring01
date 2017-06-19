package demo2;

import java.math.BigDecimal;

/**
 * Created by naresha on 07/06/17.
 */
public class D203InlineTempDemo {
    public void perform() {
        BigDecimal personalLoanAmount = new BigDecimal("100000");
        BigDecimal applicableInterestRate = InterestRates.interestRateForPersonalLoan();
        BigDecimal interestAmount = personalLoanAmount.multiply(applicableInterestRate);
        System.out.println("Interest: " + interestAmount);
    }

    public static void main(String[] args) {
        new D203InlineTempDemo().perform();
    }
}

class InterestRates {
    public static BigDecimal interestRateForPersonalLoan() {
        return new BigDecimal("0.14");
    }

    public static BigDecimal interestRateForHomeLoan() {
        return new BigDecimal("0.09");
    }
}
