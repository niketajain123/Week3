package stackadnqueue.circulartourproblem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CircularTour ct = new CircularTour();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of petrol pumps : ");
        int n=sc.nextInt();
        int[]petrol=new int[n];
        int[]distance=new int[n];
        System.out.println("Enter quantity of petrol each petrol pump have...");
        for(int i=0;i<n;i++){
            petrol[i]=sc.nextInt();
        }
        System.out.println("Enter distance to petrol pumps : ");
        for(int i=0;i<n;i++){
            distance[i]=sc.nextInt();
        }
        int startIndex = ct.findStartingPoint(petrol, distance);

        if (startIndex != -1) {
            System.out.println("The starting petrol pump index is: " + startIndex);
        } else {
            System.out.println("No possible circular tour.");
        }
    }
}
