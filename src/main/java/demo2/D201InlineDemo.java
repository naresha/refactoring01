package demo2;

/**
 * Created by naresha on 05/06/17.
 */
public class D201InlineDemo {
    void perform() {
        int number1 = 10;
        int number2 = 20;
        int maxNumber = max(number1, number2);
        System.out.println("Max: " + maxNumber);
    }

    public int max(int number1, int number2) {
        if (number1 >= number2) {
            return number1;
        }
        return number2;
    }

    public static void main(String[] args) {
        new D201InlineDemo().perform();
    }
}
