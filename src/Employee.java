public class Employee {
    private String name;
    private double baseSalary;

    // Default Constructor
    public Employee() {
        this.name = "";
        this.baseSalary = 0.0;
    }

    // Parameterized Constructor
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Setter for name
    public void setName(String newName) {
        this.name = newName;
    }

    // Setter for base salary
    public void setBaseSalary(double newSalary) {
        this.baseSalary = newSalary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for salary
    public double getSalary() {
        return baseSalary;
    }
}
