package exercise2;

/**
 * Replace temp with query
 * Created by naresha on 08/06/17.
 */
public class ComposedMethodExercise05 {
    public void perform() {
        String name = "";
        String output = processName(name);
        System.out.println("Name: " + output);
    }

    private String processName(String name) {
        boolean nameAvailable = name != null && !name.equals("");
        if (nameAvailable) {
            return name.toUpperCase();
        } else {
            return "NA";
        }
    }

    public static void main(String[] args) {
        new ComposedMethodExercise05().perform();
    }
}
