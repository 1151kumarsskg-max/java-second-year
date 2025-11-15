import java.util.Scanner;

class Student {
    String name;
    int rollNo;

    // Constructor
    Student(String n, int r) {
        name = n;
        rollNo = r;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        // Create object and set data
        Student s1 = new Student(name, rollNo);

        // Display details
        s1.display();

        sc.close();
        
    }
}
