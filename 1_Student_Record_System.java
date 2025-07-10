package core_java_projects;

import java.util.ArrayList;
import java.util.Scanner;

// Class to hold student details
class Student {
    private int rollNumber;
    private String name;
    private String grade;

    // Setters
    public void setRollNumber(int roll) {
        this.rollNumber = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    // Display details
    public void display() {
        System.out.println("Roll No: " + rollNumber + " | Name: " + name + " | Grade: " + grade);
    }
}

// Main class
public class Student_Record_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> records = new ArrayList<>();
        int choice;

        // Greeting like a school admin
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Welcome to Student Record Management System ");  
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Manage your class records with ease and precision.");

        // Menu loop
        do {
            System.out.println("\n Choose an option below:");
            System.out.println("1. Add Student Record");
            System.out.println("2. View All Records");
            System.out.println("3. Search by Roll Number");
            System.out.println("4. Exit");
            System.out.print("Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Add student
                    Student s = new Student();
                    System.out.print("Enter Roll Number: ");
                    s.setRollNumber(sc.nextInt());
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Name: ");
                    s.setName(sc.nextLine());
                    System.out.print("Enter Grade: ");
                    s.setGrade(sc.nextLine());

                    records.add(s);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    // View all
                    if (records.isEmpty()) {
                        System.out.println(" No student records found.");
                    } else {
                        System.out.println(" All Student Records:");
                        for (Student std : records) {
                            std.display();
                        }
                    }
                    break;

                case 3:
                    // Search by roll number
                    System.out.print("Enter Roll Number to search: ");
                    int roll = sc.nextInt();
                    boolean found = false;

                    for (Student std : records) {
                        if (std.getRollNumber() == roll) {
                            std.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println(" No student found with Roll Number: " + roll);
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("\n Thank you for managing your classroom records.");
                    System.out.println("Wishing you a successful academic session ahead! ");
                    break;

                default:
                    System.out.println(" Invalid input. Please enter a valid choice.");
            }

        } while (choice != 4);
    }
}
!
