import java.util.ArrayList;

public class HW2 {
    public static class Student {
        // Private attributes
        private String name;
        private int id;

        // Constructor
        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        // Getter methods
        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }
    }

    public static class StudentManager {
        // Private attribute
        private ArrayList<Student> students;

        // Constructor
        public StudentManager() {
            this.students = new ArrayList<>();
        }

        // Public methods
        public void addStudent(Student student) {
            students.add(student);
        }

        public Student getStudentById(int id) {
            for (Student student : students) {
                if (student.getId() == id) {
                    return student;
                }
            }
            return null; // Return null if student with given id is not found
        }

        public ArrayList<Student> getAllStudents() {
            return students;
        }

        public boolean removeStudentById(int id) {
            for (Student student : students) {
                if (student.getId() == id) {
                    students.remove(student);
                    return true; // Return true if student with given id is found and removed
                }
            }
            return false; // Return false if student with given id is not found
        }
    }

    public static class Main {
        public static void main(String[] args) {
            // Create a StudentManager object
            StudentManager studentManager = new StudentManager();

            // Create and add some students
            studentManager.addStudent(new Student("John Doe", 123456));
            studentManager.addStudent(new Student("Jane Smith", 789012));
            studentManager.addStudent(new Student("Alice Johnson", 456789));

            // Retrieve and print student information by ID
            System.out.println("Getting student by ID:");
            Student studentById = studentManager.getStudentById(123456);
            if (studentById != null) {
                System.out.println("Name: " + studentById.getName());
                System.out.println("ID: " + studentById.getId());
            } else {
                System.out.println("Student not found.");
            }

            // Display all students
            System.out.println("\nAll students:");
            ArrayList<Student> allStudents = studentManager.getAllStudents();
            for (Student student : allStudents) {
                System.out.println("Name: " + student.getName() + ", ID: " + student.getId());
            }

            // Remove a student by ID
            System.out.println("\nRemoving student by ID:");
            boolean removed = studentManager.removeStudentById(789012);
            if (removed) {
                System.out.println("Student removed successfully.");
            } else {
                System.out.println("Student not found.");
            }

            // Display all students again to confirm removal
            System.out.println("\nAll students after removal:");
            allStudents = studentManager.getAllStudents();
            for (Student student : allStudents) {
                System.out.println("Name: " + student.getName() + ", ID: " + student.getId());
            }
        }
    }
}
