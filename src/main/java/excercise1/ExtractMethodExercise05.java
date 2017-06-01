package excercise1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by naresha on 31/05/17.
 */
public class ExtractMethodExercise05 {

    private static final Map<Long, Employee> db = new HashMap<>();

    public void perform() {
        Employee ramesh = new Employee(1L, "Ramesh");
        db.put(ramesh.getId(), ramesh);
        Employee seema = new Employee(2L, "Seema");
        db.put(seema.getId(), seema);
        Employee mark = new Employee(3L, "Mark");
        db.put(mark.getId(), mark);
        Employee anotherRamesh = new Employee(4L, "Ramesh");
        db.put(anotherRamesh.getId(), anotherRamesh);
        // Get employee with id 3
        Employee employeeWithId3 = db.get(3L);
        System.out.println("Employee with id 3 :" + employeeWithId3);
        // Get employee with id 2
        Employee employeeWithId2 = db.get(2L);
        System.out.println("Employee with id 2 :" + employeeWithId2);
        //Find employees with name Ramesh
        List<Employee> employeesWithNameRamesh = new ArrayList<>();
        for(Employee employee : db.values()) {
            if(employee.getName().equalsIgnoreCase("Ramesh")){
                employeesWithNameRamesh.add(employee);
            }
        }
        System.out.println("Employees with name Ramesh: " + employeesWithNameRamesh);
        List<Employee> employeesWithNameSeema = new ArrayList<>();
        for(Employee employee : db.values()) {
            if(employee.getName().equalsIgnoreCase("Seema")){
                employeesWithNameSeema.add(employee);
            }
        }
        System.out.println("Employees with name Seema: " + employeesWithNameSeema);
    }


    public static void main(String[] args) {
        new ExtractMethodExercise05().perform();
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

