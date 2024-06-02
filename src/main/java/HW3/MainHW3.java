package HW3;

public class MainHW3 extends Main {
    public static void main(String[] args) {
        // Part 1: Class and Object Creation
        Person person1 = new Person("Ghada Khalid", 23, "111 Al-Naseem");
        Person person2 = new Person("Jood Ali", 25, "222 Al-Naaim");
        System.out.println(person1);
        System.out.println(person2);

        // Part 2: Inheritance and Polymorphism
        Student student1 = new Student("Mohammed Saad", 30, "333 Al-Hammra", 1001, "Computer Science");
        System.out.println(student1);

        // Part 3: Collections
        School school = new School();
        school.addStudent(student1);
        school.displayStudents();

        // Part 4: File Read/Write Operations
        school.writeToFile("students.txt");
        school.readFromFile("students.txt");
        school.displayStudents();
    }
}
