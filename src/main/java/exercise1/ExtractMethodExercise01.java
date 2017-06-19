package exercise1;

/**
 * Extract method refactoring with read only variable dependency
 * Created by naresha on 29/05/17.
 */
public class ExtractMethodExercise01 {
    public void printPattern() {
        System.out.println("==");
        System.out.println("====");
        System.out.println("=========");
        System.out.println("================");
    }

    public static void main(String[] args) {
        new ExtractMethodExercise01().printPattern();
    }



}
