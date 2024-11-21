public class EmployeeManagerTest {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("John Doe", 50000);
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: $" + emp.getSalary());

        // Create a Manager object
        Manager mgr = new Manager("Jane Smith", 70000, 15000);
        System.out.println("\nManager Name: " + mgr.getName());
        System.out.println("Manager Base Salary: $" + mgr.getSalary() + " (Includes Bonus: $" + mgr.getBonus() + ")");
    }
}

