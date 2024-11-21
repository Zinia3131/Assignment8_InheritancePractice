public class TestEmployee {
    public static void main(String[] args) {
        // Create Employee, Manager, and Executive objects
        Employee2 employee = new Employee2("Alice", 50000);
        Manager2 manager = new Manager2("Bob", 80000, "HR");
        Executive executive = new Executive("Charlie", 120000, "Finance");

        // Display details using toString()
        System.out.println(employee);
        System.out.println(manager);
        System.out.println(executive);
    }
}

