import java.util.*;

class Employees {
    
    String name;
    String department;
    int salary;
    int age;

    Employees(String name, String department, int salary, int age) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public int getSalary() { return salary; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return name + " " + department + " " + salary + " " + age;
    }
}

public class StreamsExample {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employees("A", "Dev", 60000, 25),
                new Employees("B", "HR", 40000, 30),
                new Employees("C", "Dev", 55000, 28),
                new Employees("D", "Support", 30000, 35)
        );

        // 1. Filter by department "Dev"
        List<Employee> devEmployees = employees.stream()
                .filter(e -> e.getDepartment().equals("Dev"))
                .toList();
        System.out.println("Dev Employees: " + devEmployees);

        // 2. Salary greater than 50K
        List<Employee> highSalary = employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .toList();
        System.out.println("Salary > 50K: " + highSalary);

        // 3. Total salary using sum()
        int totalSalary = employees.stream()
                .mapToInt(Employee::getSalary)
                .sum();
        System.out.println("Total Salary: " + totalSalary);

        // 4. Average salary
        double avgSalary = employees.stream()
                .mapToInt(Employee::getSalary)
                .average()
                .orElse(0);
        System.out.println("Average Salary: " + avgSalary);

        // 5. Count of employees
        long count = employees.stream().count();
        System.out.println("Total Employees: " + count);
    }
  
