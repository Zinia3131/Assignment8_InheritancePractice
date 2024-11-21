public class Employee2 {
    private String name;
    private double salary;

    // Constructor
    public Employee2(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee: " + name + ", Salary: " + salary;
    }
}

