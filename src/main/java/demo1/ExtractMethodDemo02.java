package demo1;

import java.math.BigDecimal;

/**
 * Extract method refactoring involving dependency on variables
 * and variables moving into the extracted method
 * Created by naresha on 30/05/17.
 */
public class ExtractMethodDemo02 {
    public void printInterestAmount() {
        int principle = 10_000;
        double interest = principle * 0.1;
        System.out.println("=============================");
        System.out.println("Interest: " + interest);
        System.out.println("=============================");
    }

    public static void main(String[] args) {
        new ExtractMethodDemo02().printInterestAmount();
    }
}
