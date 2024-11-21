public class TestPerson {
    public static void main(String[] args) {
        // Create a Person, Student, and Instructor
        Person person = new Person("Alice", 1985);
        Student student = new Student("Bob", 2000, "Computer Science");
        Instructor instructor = new Instructor("Dr. Smith", 1975, 75000);

        // Display their details using toString()
        System.out.println(person);
        System.out.println(student);
        System.out.println(instructor);
    }
}

