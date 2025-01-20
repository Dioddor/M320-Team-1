package D2;

import java.util.ArrayList;

class Test {
    private int score;
    private int totalPoints;

    // Constructor to create a test with a score and total points
    // Why: A test must have a score and a total point value to calculate the grade
    public Test(int score, int totalPoints) {
        this.score = score;
        this.totalPoints = totalPoints;
    }

    // Method to calculate the grade based on the given formula, rounded to 2 decimal places
    // Why: Grades should be calculated accurately and presented in a readable format (2 decimal places)
    public double calculateGrade() {
        double grade = (score * 5.0 / totalPoints) + 1;
        return Math.round(grade * 100.0) / 100.0; // Rounds to 2 decimal places
    }
}

class Student {
    private String name;
    private ArrayList<Test> tests;

    // Constructor to create a student with a name
    // Why: Every student must have a name to identify them
    public Student(String name) {
        this.name = name;
        this.tests = new ArrayList<>();
    }

    // Method to add a test to the student's test list
    // Why: Each student can take multiple tests, so we need a way to store them
    public void addTest(Test test) {
        tests.add(test);
    }

    // Method to calculate the average grade of the student, rounded to 2 decimal places
    // Why: The average grade shows the overall performance of the student in all tests
    public double calculateAverageGrade() {
        double totalGrade = 0.0;
        for (Test test : tests) {
            totalGrade += test.calculateGrade();
        }
        double average = totalGrade / tests.size();
        return Math.round(average * 100.0) / 100.0; // Rounds to 2 decimal places
    }

    // Method to get the student's name and average grade
    // Why: This is needed to display the student's details in a simple format
    public String getDetails() {
        return name + " - Average Grade: " + calculateAverageGrade();
    }
}

class SchoolClass {
    private ArrayList<Student> students;

    // Constructor to create an empty list of students
    // Why: A class starts with no students, so we need an empty list to add students later
    public SchoolClass() {
        students = new ArrayList<>();
    }

    // Method to add a student to the class
    // Why: A class is made up of students, so we need a way to add them
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to calculate the average grade of the entire class, rounded to 2 decimal places
    // Why: The class average shows the overall performance of all students combined
    public double calculateClassAverage() {
        double totalAverage = 0.0;
        for (Student student : students) {
            totalAverage += student.calculateAverageGrade();
        }
        double classAverage = totalAverage / students.size();
        return Math.round(classAverage * 100.0) / 100.0; // Rounds to 2 decimal places
    }

    // Method to display all students and the class average
    // Why: This is needed to see individual performance and how the class is performing as a whole
    public void displayClassDetails() {
        for (Student student : students) {
            System.out.println(student.getDetails());
        }
        System.out.println("Class Average Grade: " + calculateClassAverage());
    }
}
