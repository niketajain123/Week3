package doublylinkedlist.librarymanagementsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookLinkedList books=new BookLinkedList();
        int choice;
        Scanner sc=new Scanner(System.in);
        do{

            System.out.println("Enter 1 for adding book at beginning.");
            System.out.println("Enter 2 for adding book at end.");
            System.out.println("Enter 3 for adding book at specific position.");
            System.out.println("Enter 4 for removing book.");
            System.out.println("Enter 5 for searching book by title.");
            System.out.println("Enter 6 for searching book by author.");
            System.out.println("Enter 7 for updating book's availability status by book title.");
            System.out.println("Enter 8 for displaying book list in forward order.");
            System.out.println("Enter 9 for displaying book list in reverse order.");
            System.out.println("Enter 10 for getting count of books.");
            System.out.println("Enter 0 for exit.");
            choice=sc.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Enter title, author, genre, id and availability status  of book : ");
                    books.addAtBeginning(sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.nextBoolean());
                    break;

                case 2 :
                    System.out.println("Enter title, author, genre, id and availability status  of book : ");
                    books.addAtEnd(sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.nextBoolean());
                    break;
                case 3 :
                    System.out.println("Enter title, author, genre, id, availability status and position  of book : ");
                    books.addAtPosition(sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.nextBoolean(),sc.nextInt());
                    break;
                case 4 :
                    System.out.println("Enter id of book to be deleted : ");
                    books.removeBookById(sc.nextInt());
                    break;
                case 5 :
                    System.out.println("Enter title of book to be searched : ");
                    books.searchBookByTitle(sc.next());
                    break;
                case 6 :
                    System.out.println("Enter author of book to be searched : ");
                    books.searchBookByAuthor(sc.next());
                    break;
                case 7 :
                    System.out.println("Enter id of book and availability status to be updated : ");
                    books.updateAvailabilityStatus(sc.nextInt(),sc.nextBoolean());
                    break;
                case 8 :
                    System.out.println("Books in forward direction...");
                    books.displayForward();
                    break;
                case 9 :
                    System.out.println("Books in backward direction...");
                    books.displayBackward();
                    break;
                case 10 :
                    System.out.println("Total number of books in list : "+books.count());
                    break;
                case 0 :
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        }while (choice!=0);
    }
}
