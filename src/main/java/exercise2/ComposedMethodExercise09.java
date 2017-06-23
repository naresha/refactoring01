package exercise2;

/**
 * Inline method?
 * Created by naresha on 22/06/17.
 */
public class ComposedMethodExercise09 {
    public static void main(String[] args) {
        new CounterClient().compute();
    }
}

class Counter {
    private int count = 0;

    public int getValue() {
        count++;
        return 10;
    }
}

class CounterClient {

    public void compute() {
        Counter counter = new Counter();
        int number = counter.getValue();
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result += number;
        }
        System.out.println(result);
    }
}
