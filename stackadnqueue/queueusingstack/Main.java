package stackadnqueue.queueusingstack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue queue=new Queue();
        int choice;
        do{
            System.out.println("Enter 1 for enqueue ");
            System.out.println("Enter 2 for dequeue");
            System.out.println("Enter 3 for peek");
            System.out.println("Enter 4 for checking is queue empty");
            System.out.println("Enter 0 for exit");
            choice=sc.nextInt();
            switch (choice){
                case 1 :
                    System.out.print("Enter non-zero integers to insert : ");
                    queue.enqueue(sc.nextInt());
                    break;
                case 2 :
                    System.out.println("Dequeued element : "+queue.dequeue());
                    break;
                case 3 :
                    System.out.println("Peek element : "+queue.peek());
                    break;
                case 4 :
                    System.out.println("Is queue empty? "+queue.isEmpty());
                    break;
                case 0 :
                    break;
                default :
                    System.out.println("Invalid choice!");
            }
        }while (choice!=0);
    }
}
