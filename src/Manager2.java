public class Manager2 extends Employee {
    private String department;

    // Constructor
    public Manager2(String name, double salary, String department) {
        super(name, salary); // Call to Employee constructor
        this.department = department;
    }

    // Getter
    public String getDepartment() {
        return department;
    }

    // toString method
    @Override
    public String toString() {
        return "Manager: " + getName() + ", Department: " + department + ", Salary: " + getSalary();
    }
}
