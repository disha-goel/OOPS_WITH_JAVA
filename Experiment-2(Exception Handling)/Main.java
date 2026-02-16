//UID:24BCS10773

import java.util.Scanner;
import java.util.InputMismatchException;

class Student{
    String name;
    int marks;
    String grade;

    void Grade() {
        if (marks >= 90) {
            grade = "Grade A";
        } 
        else if (marks >= 75) {
            grade = "Grade B";
        } 
        else if (marks >= 60) {
            grade = "Grade C";
        } 
        else if (marks >= 40) {
            grade = "Grade D";
        } 
        else {
            grade = "Fail";
        }
    }
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks Entered: " + marks);
        System.out.println("Grade Obtained: " + grade);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        try {
            System.out.print("Enter student name: ");
            s.name = sc.nextLine();
            System.out.print("Enter marks (out of 100): ");
            s.marks = sc.nextInt();
            if (s.marks < 0 || s.marks > 100) {
                throw new IllegalArgumentException("Marks must be between 0 and 100.");
            }
            s.Grade();
            s.display();
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric marks only.");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Marks evaluation completed.");
        }
        sc.close();
    }
}
/*
INPUT:
Enter student name: Disha
Enter marks (out of 100): 92

OUTPUT:
Student Name: Disha
Marks Entered: 92
Grade Obtained: Grade A
Marks evaluation completed.
*/
