package exercise1;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by naresha on 30/05/17.
 */
public class ExtractMethodExercise03 {

    public static void main(String[] args) {
        new ExtractMethodExercise03().perform();
    }

    private void perform() {
        final List<Person> people = Arrays.asList(
                new Person("Ram", "Kumar", 25),
                new Person("Simon", "Stuart", 34),
                new Person("Jeff", "Brown", 38)
        );
        List<Person> peopleOlderThan32 = new ArrayList<>();
        for (Person person : people) {
            if (person.age > 32) {
                peopleOlderThan32.add(person);
            }
        }
        List<String> firstNames = new ArrayList<>();
        for (Person person : peopleOlderThan32) {
            firstNames.add(person.getFirstName());
        }
        for (String name : firstNames) {
            System.out.println(name);
        }
    }
}


@Getter
@Setter
class Person {
    private String firstName;
    private String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
