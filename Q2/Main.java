package Q2;

/**
 * Main class to demonstrate the functionality of managing students, their tests, and grades.
 * This program calculates and displays individual and class average grades.
 */
public class Main {
    /**
     * The entry point of the program.
     * 
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create a new school class
        SchoolClass schoolClass = new SchoolClass();

        // Create students and add them to the class
        Student student1 = new Student("Alice");
        student1.addTest(new Test(45, 50));
        student1.addTest(new Test(38, 40));
        student1.addTest(new Test(90, 100));
        schoolClass.addStudent(student1);

        Student student2 = new Student("Bob");
        student2.addTest(new Test(30, 50));
        student2.addTest(new Test(25, 40));
        student2.addTest(new Test(80, 100));
        schoolClass.addStudent(student2);

        Student student3 = new Student("Charlie");
        student3.addTest(new Test(50, 50));
        student3.addTest(new Test(40, 40));
        student3.addTest(new Test(100, 100));
        schoolClass.addStudent(student3);

        // Display all student details and the class average
        schoolClass.displayClassDetails();
    }
}