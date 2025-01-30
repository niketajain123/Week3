package singlylinkedlist.studentrecordmanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentLinkedList students=new StudentLinkedList();
        int choice;
        Scanner sc=new Scanner(System.in);
        do{

            System.out.println("Enter 1 for adding at beginning.");
            System.out.println("Enter 2 for adding at end.");
            System.out.println("Enter 3 for adding at specific position.");
            System.out.println("Enter 4 for deleting student by roll number.");
            System.out.println("Enter 5 for searching student by roll number.");
            System.out.println("Enter 6 for updating student's grade by roll number.");
            System.out.println("Enter 7 for displaying student list.");
            System.out.println("Enter 8 for exit.");
            choice=sc.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Enter name, roll number, grade and age : ");
                    students.addStudentAtBeginning(sc.next(),sc.nextInt(),sc.next(),sc.nextInt());
                    break;

                case 2 :
                    System.out.println("Enter name, roll number, grade and age : ");
                    students.addStudentAtEnd(sc.next(),sc.nextInt(),sc.next(),sc.nextInt());
                    break;
                case 3 :
                    System.out.println("Enter name, roll number, grade, age and position : ");
                    students.addStudentAtPosition(sc.next(),sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt());
                    break;
                case 4 :
                    System.out.println("Enter roll number of student to be deleted : ");
                    students.deleteByRollNumber(sc.nextInt());
                    break;
                case 5 :
                    System.out.println("Enter roll number of student to be searched : ");
                    students.searchStudentByRollNumber(sc.nextInt());
                    break;
                case 6 :
                    System.out.println("Enter new grade and roll number of student to update grade : ");
                    students.updateStudentGrade(sc.next(),sc.nextInt());
                    break;
                case 7 :
                    students.display();
                    break;
                case 8 :
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        }while (choice!=8);
    }
}
