import java.util.ArrayList;
import java.util.List;

// Employee class definition
class Employee {
    // Attributes of Employee
    int id;
    String name;
    double salary;

    // Constructor to initialize the Employee object
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
        System.out.println(); // To separate employee details
    }
}

public class Main {
    public static void main(String[] args) {
        // Create at least 3 Employee objects
        Employee emp1 = new Employee(101, "Himanshi", 50000);
        Employee emp2 = new Employee(102, "Raj", 60000);
        Employee emp3 = new Employee(103, "Saloni", 70000);

        // Store them in a list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        // Display their details
        System.out.println("Employee Details:");
        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
    }
}
