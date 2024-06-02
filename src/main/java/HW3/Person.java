package HW3;

import java.io.*;
import java.util.*;

// Part 1: Class and Object Creation
class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        setAge(age);
        this.address = address;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150)
            throw new IllegalArgumentException("Age must be between 0 and 150");
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person: " + name + ", Age: " + age + ", Address: " + address;
    }
}

// Subclass Student
class Student extends Person {
    private int studentId;
    private String course;

    public Student(String name, int age, String address, int studentId, String course) {
        super(name, age, address);
        setStudentId(studentId);
        this.course = course;
    }

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        if (studentId <= 0)
            throw new IllegalArgumentException("Student ID must be positive");
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + studentId + ", Course: " + course;
    }
}

// Part 2: Abstract Classes and Interfaces
abstract class PersonRecord {
    abstract String getDetails();
}

interface ComparableById {
    boolean compareById(int id);
}

// Implementing interfaces
class StudentRecord extends PersonRecord implements ComparableById {
    private Student student;

    public StudentRecord(Student student) {
        this.student = student;
    }

    @Override
    public String getDetails() {
        return student.toString();
    }

    @Override
    public boolean compareById(int id) {
        return student.getStudentId() == id;
    }
}

// Part 3: Collections
class School {
    private List<Student> students = new ArrayList<>();

    // Add student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Remove student by studentId
    public void removeStudent(int studentId) {
        students.removeIf(student -> student.getStudentId() == studentId);
    }

    // Display all students
    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Sorting students by name
    public void sortStudentsByName() {
        students.sort(Comparator.comparing(Student::getName));
    }

    // Binary search for a student by studentId
    public Student findStudentById(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }

    // Part 4: File Read/Write Operations
    // Writing to Files
    public void writeToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            for (Student student : students) {
                writer.println(student.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Reading from Files
    public void readFromFile(String filename) {
        students.clear(); // Clear existing students
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(", ");
                String name = parts[0].substring(parts[0].indexOf(":") + 2);
                int age = Integer.parseInt(parts[1].substring(parts[1].indexOf(":") + 2));
                String address = parts[2].substring(parts[2].indexOf(":") + 2);
                int studentId = Integer.parseInt(parts[3].substring(parts[3].indexOf(":") + 2));
                String course = parts[4].substring(parts[4].indexOf(":") + 2);
                students.add(new Student(name, age, address, studentId, course));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

