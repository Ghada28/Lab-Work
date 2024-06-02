package HW3;

public class Main {
        public static void main(String[] args) {
            Person person1 = new Person("John Doe", 25, "123 Main St");
            Person person2 = new Person("Jane Smith", 30, "456 Elm St");

            System.out.println("Person 1 Details:");
            System.out.println("Name: " + person1.getName());
            System.out.println("Age: " + person1.getAge());
            System.out.println("Address: " + person1.getAddress());

            System.out.println("\nPerson 2 Details:");
            System.out.println("Name: " + person2.getName());
            System.out.println("Age: " + person2.getAge());
            System.out.println("Address: " + person2.getAddress());

            Student student1 = new Student("Alice Johnson", 20, "789 Oak St", 1001, "Computer Science");
            Student student2 = new Student("Bob Williams", 22, "321 Pine St", 1002, "Physics");

            System.out.println("\nStudent 1 Details:");
            System.out.println(student1);

            System.out.println("\nStudent 2 Details:");
            System.out.println(student2);
        }
    }
