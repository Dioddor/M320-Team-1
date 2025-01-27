package Q2;

import java.util.ArrayList;

/**
 * Represents a single test with a score and total points.
 */
class Test {
    private int score;
    private int totalPoints;

    /**
     * Constructor to create a test with a score and total points.
     * 
     * @param score      The score achieved on the test.
     * @param totalPoints The total points possible for the test.
     */
    public Test(int score, int totalPoints) {
        this.score = score;
        this.totalPoints = totalPoints;
    }

    /**
     * Calculates the grade for this test, rounded to 2 decimal places.
     * 
     * @return The calculated grade as a double.
     */
    public double calculateGrade() {
        double grade = (score * 5.0 / totalPoints) + 1;
        return Math.round(grade * 100.0) / 100.0; // Rounds to 2 decimal places
    }
}

/**
 * Represents a student with a name and a list of tests.
 */
class Student {
    private String name;
    private ArrayList<Test> tests;

    /**
     * Constructor to create a student with a name.
     * 
     * @param name The name of the student.
     */
    public Student(String name) {
        this.name = name;
        this.tests = new ArrayList<>();
    }

    /**
     * Adds a test to the student's list of tests.
     * 
     * @param test The test to be added.
     */
    public void addTest(Test test) {
        tests.add(test);
    }

    /**
     * Calculates the average grade of the student, rounded to 2 decimal places.
     * 
     * @return The average grade as a double.
     */
    public double calculateAverageGrade() {
        double totalGrade = 0.0;
        for (Test test : tests) {
            totalGrade += test.calculateGrade();
        }
        double average = totalGrade / tests.size();
        return Math.round(average * 100.0) / 100.0; // Rounds to 2 decimal places
    }

    /**
     * Gets the student's name and average grade.
     * 
     * @return A string containing the student's name and average grade.
     */
    public String getDetails() {
        return name + " - Average Grade: " + calculateAverageGrade();
    }
}

/**
 * Represents a school class containing multiple students.
 */
class SchoolClass {
    private ArrayList<Student> students;

    /**
     * Constructor to create an empty list of students.
     */
    public SchoolClass() {
        students = new ArrayList<>();
    }

    /**
     * Adds a student to the class.
     * 
     * @param student The student to be added.
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Calculates the average grade of the entire class, rounded to 2 decimal places.
     * 
     * @return The class average grade as a double.
     */
    public double calculateClassAverage() {
        double totalAverage = 0.0;
        for (Student student : students) {
            totalAverage += student.calculateAverageGrade();
        }
        double classAverage = totalAverage / students.size();
        return Math.round(classAverage * 100.0) / 100.0; // Rounds to 2 decimal places
    }

    /**
     * Displays the details of all students and the class average.
     */
    public void displayClassDetails() {
        for (Student student : students) {
            System.out.println(student.getDetails());
        }
        System.out.println("Class Average Grade: " + calculateClassAverage());
    }
}
