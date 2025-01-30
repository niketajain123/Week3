package doublylinkedlist.moviemanagementsystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovieLinkedList movies=new MovieLinkedList();
        int choice;
        Scanner sc=new Scanner(System.in);
        do{

            System.out.println("Enter 1 for adding movie at beginning.");
            System.out.println("Enter 2 for adding movie at end.");
            System.out.println("Enter 3 for adding movie at specific position.");
            System.out.println("Enter 4 for removing movie.");
            System.out.println("Enter 5 for searching movie by director.");
            System.out.println("Enter 6 for searching movie by rating.");
            System.out.println("Enter 7 for updating movie's rating by movie title.");
            System.out.println("Enter 8 for displaying movie list in forward order.");
            System.out.println("Enter 9 for displaying movie list in reverse order.");
            System.out.println("Enter 0 for exit.");
            choice=sc.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Enter movie title, director, year of release, and rating : ");
                    movies.addAtBeginning(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble());
                    break;

                case 2 :
                    System.out.println("Enter movie title, director, year of release, and rating : ");
                    movies.addAtEnd(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble());
                    break;
                case 3 :
                    System.out.println("Enter movie title, director, year of release, rating and position : ");
                    movies.addAtPosition(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextInt());
                    break;
                case 4 :
                    System.out.println("Enter title of movie to be deleted : ");
                    movies.removeMovieByTitle(sc.next());
                    break;
                case 5 :
                    System.out.println("Enter director of movie to be searched : ");
                    movies.searchMovieByDirector(sc.next());
                    break;
                case 6 :
                    System.out.println("Enter rating of movie to be searched : ");
                    movies.searchMovieByRating(sc.nextDouble());
                    break;
                case 7 :
                    System.out.println("Enter title of movie and rating to be updated : ");
                    movies.updateRatingByTitle(sc.next(),sc.nextDouble());
                    break;
                case 8 :
                    System.out.println("Movies in forward direction...");
                    movies.displayForward();
                    break;
                case 9 :
                    System.out.println("Movies in backward direction...");
                    movies.displayBackward();
                    break;
                case 0 :
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        }while (choice!=0);
    }

}
