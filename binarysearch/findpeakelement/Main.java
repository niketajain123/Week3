package binarysearch.findpeakelement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size= sc.nextInt();
        int[]numbers=new int[size];
        System.out.println("Enter "+size+" elments : ");
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        FindPeakElement.findPeak(numbers);
    }
}
