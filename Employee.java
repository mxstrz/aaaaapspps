import java.util.ArrayList; // Для ArrayList
import java.util.List;      // Для List

class Employee {
    private String name;
    private double salary;
    private String department;

    // Constructor
    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

class Company {
    private List<Employee> employees = new ArrayList<>();

    // Add a new employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Remove an employee by name
    public void removeEmployee(String name) {
        employees.removeIf(employee -> employee.getName().equalsIgnoreCase(name));
    }

    // Calculate total salary
    public double calculateTotalSalary() {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total;
    }

    // Calculate average salary
    public double calculateAverageSalary() {
        if (employees.isEmpty()) {
            return 0;
        }
        return calculateTotalSalary() / employees.size();
    }
}

