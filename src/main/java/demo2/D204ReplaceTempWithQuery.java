package demo2;

import java.math.BigDecimal;

/**
 * Created by naresha on 08/06/17.
 */
public class D204ReplaceTempWithQuery {

    public void perform() {
        BigDecimal income = new BigDecimal(12_00_000);
        BigDecimal result;
        BigDecimal tax = income.multiply(new BigDecimal("0.10"));
        if (income.compareTo(new BigDecimal(10_00_000)) >= 1) {
            result = tax.add(new BigDecimal(5000));
        } else {
            result = tax;
        }
        BigDecimal tds = result;
        System.out.println("TDS: " + tds);
    }

    public static void main(String[] args) {
        new D204ReplaceTempWithQuery().perform();
    }
}
