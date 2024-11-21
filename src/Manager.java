public class Manager extends Employee {
    private double bonus;

    // Default Constructor
    public Manager() {
        super();
        this.bonus = 0.0;
    }

    // Parameterized Constructor
    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary); // Call the constructor of Employee
        this.bonus = bonus;
    }

    // Setter for bonus
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Getter for bonus
    public double getBonus() {
        return bonus;
    }

    // Override getSalary method to include bonus
    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
}

