public class Executive extends Manager2 {
    // Constructor
    public Executive(String name, double salary, String department) {
        super(name, salary, department); // Call to Manager constructor
    }

    // toString method
    @Override
    public String toString() {
        return "Executive: " + getName() + ", Department: " + getDepartment() + ", Salary: " + getSalary();
    }
}
