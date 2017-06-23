package demo2;

/**
 * Created by naresha on 21/06/17.
 */
public class D207RemoveAssignmentsToParameters {

    public void perform() {
        int age = 25;
        int newAge = celebrateBirthday(age);
        System.out.println(newAge);
    }

    public int celebrateBirthday(int age) {
        age = age + 1;
        return age;
    }

    public static void main(String[] args) {
        new D207RemoveAssignmentsToParameters().perform();
    }
}
