package demo2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * Created by naresha on 08/06/17.
 */
public class D205IntroduceExplainingVariable {

    public void perform() {
        Expense expense = new Expense(new BigDecimal(10000), false, "OPEN");
        processExpense(expense);
        System.out.println("Expense: " + expense);
    }

    public void processExpense(Expense expense) {
        if (expense.getAmount().compareTo(new BigDecimal(10000)) > 0) {
            if (expense.isApprovedByManager()) {
                expense.setStatus("APPROVED");
            } else {
                expense.setStatus("REJECTED");
            }
        } else {
            expense.setStatus("APPROVED");
        }
    }

    public static void main(String[] args) {
        new D205IntroduceExplainingVariable().perform();
    }
}

@Getter
@Setter
@AllArgsConstructor
@ToString
class Expense {
    private BigDecimal amount;
    private boolean approvedByManager;
    private String status;
}
