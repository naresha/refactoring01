package exercise2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by naresha on 07/06/17.
 */
public class ComposedMethodExercise03 {

    private static final Map<Long, Employee> db = new HashMap<>();

    public void perform() {
        Employee ramesh = new Employee(1L, "Ramesh");
        Employee seema = new Employee(2L, "Seema");
        Employee mark = new Employee(3L, "Mark");
        saveEmployees(ramesh, seema, mark);
    }

    private void saveEmployees(Employee employee1, Employee employee2, Employee employee3) {
        db.put(employee1.getId(), employee1);
        db.put(employee2.getId(), employee2);
        db.put(employee3.getId(), employee3);
    }

    public static void main(String[] args) {
        new ComposedMethodExercise03().perform();
    }
}


@Getter
@Setter
@AllArgsConstructor
@ToString
class Employee {
    private Long id;
    private String name;

}
