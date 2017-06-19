package exercise2;

/**
 * Inline exercise
 * Created by naresha on 05/06/17.
 */
public class ComposedMethodExercise02 {

    public void perform() {
        int number1 = 10;
        int number2 = 30;
        int number3 = 15;
        int largestNumber = max(number1, number2, number3);
        System.out.println("Max: " + largestNumber);
    }

    public int max(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            }
            return c;
        }
    }

    public static void main(String[] args) {
        new ComposedMethodExercise02().perform();
    }
}
