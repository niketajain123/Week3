package circularlinkedlist.ticketreservationsystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TicketLinkedList tickets=new TicketLinkedList();
        int choice;
        do{

            System.out.println("Enter 1 for booking ticket.");
            System.out.println("Enter 2 for removing a ticket.");
            System.out.println("Enter 3 for displaying tickets.");
            System.out.println("Enter 4 for getting total ticket count.");
            System.out.println("Enter 5 for searching ticket by movie name.");
            System.out.println("Enter 6 for searching ticket by customer name.");
            System.out.println("Enter 0 for exit.");
            choice=sc.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Enter ticket id, customer name, movie name, seat number, and booking time : ");
                    tickets.addAtEnd(sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.next());
                    break;
                case 2 :
                    System.out.println("Enter id of ticket to be deleted : ");
                    tickets.removeById(sc.nextInt());
                    break;
                case 3 :
                    System.out.println("Tickets... ");
                    tickets.display();
                    break;
                case 4 :
                    System.out.println("Total number of tickets : "+tickets.totalTickets());
                    break;
                case 5 :
                    System.out.println("Enter movie name of ticket to be searched : ");
                    tickets.searchTicketByMovieName(sc.next());
                    break;
                case 6 :
                    System.out.println("Enter customer name of ticket to be searched : ");
                    tickets.searchTicketByCustomerName(sc.next());
                    break;
                case 0 :
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        }while (choice!=0);
    }
}
