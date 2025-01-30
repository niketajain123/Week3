package circularlinkedlist.taskscheduler;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskLinkedList tasks=new TaskLinkedList();
        int choice;
        Scanner sc=new Scanner(System.in);
        do{

            System.out.println("Enter 1 for adding task at beginning.");
            System.out.println("Enter 2 for adding task at end.");
            System.out.println("Enter 3 for adding task at specific position.");
            System.out.println("Enter 4 for removing task.");
            System.out.println("Enter 5 for searching task by priority.");
            System.out.println("Enter 6 for displaying task list.");
            System.out.println("Enter 7 for viewing current task and moving onto next task.");
            System.out.println("Enter 0 for exit.");
            choice=sc.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Enter id, name, priority and date of task: ");
                    tasks.addAtBeginning(sc.nextInt(),sc.next(),sc.nextInt(), sc.next());
                    break;

                case 2 :
                    System.out.println("Enter id, name, priority and date of task: ");
                    tasks.addAtEnd(sc.nextInt(),sc.next(),sc.nextInt(), sc.next());
                    break;

                case 3 :
                    System.out.println("Enter id, name, priority, date and position of task: ");
                    tasks.addAtPosition(sc.nextInt(),sc.next(),sc.nextInt(), sc.next(),sc.nextInt());
                    break;

                case 4 :
                    System.out.println("Enter id of task to be deleted : ");
                    tasks.removeTaskById(sc.nextInt());
                    break;
                case 5 :
                    System.out.println("Enter id of task to be searched : ");
                    tasks.searchByPriority(sc.nextInt());
                    break;
                case 6 :
                    System.out.println("Tasks...");
                    tasks.display();
                    break;
                case 7 :
                    System.out.println("Current task...");
                    tasks.moveNextTask();
                    break;
                 case 0 :
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        }while (choice!=0);
    }
}
