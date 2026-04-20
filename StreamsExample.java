import java.util.*;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " " + salary;
    }
}

public class StreamsExample {
    public static void main(String[] args) {

        List<Integer> nums = List.of(2, 3, 4, 5, 6);

        // Multiply
        List<Integer> multiplyBy2 = nums.stream()
                .map(i -> i * 2)
                .toList();
        System.out.println(multiplyBy2);

        // Even numbers
        List<Integer> evenNumbers = nums.stream()
                .filter(i -> i % 2 == 0)
                .toList();
        System.out.println(evenNumbers);

        // Sum of all numbers
        int total = nums.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(total);

        // Employees
        List<Employee> employees = List.of(
                new Employee("Employee1", 22222),
                new Employee("Employee2", 444444)
        );

        // Names
        List<String> employeeNames = employees.stream()
                .map(Employee::getName)
                .toList();

        // Filter by salary
        List<Employee> greaterSalary = employees.stream()
                .filter(i -> i.getSalary() > 30000)
                .toList();

        System.out.println("After Filter: " + greaterSalary);
        System.out.println(employeeNames);
    }
}
