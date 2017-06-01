package demo1;

/**
 * Extract method refactoring without involving dependant variables
 * Created by naresha on 29/05/17.
 */
public class ExtractMethodDemo01 {
    public void wish() {
        System.out.println("===========================================");
        System.out.println("Hello");
        System.out.println("===========================================");
    }

    public void wish(String friend) {
        System.out.println("===========================================");
        System.out.println("Hello " + friend);
        System.out.println("===========================================");
    }
}
