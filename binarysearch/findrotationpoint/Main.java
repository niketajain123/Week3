package binarysearch.findrotationpoint;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int number=sc.nextInt();
        int[]array=new int[number];
        System.out.println("Enter "+number+" elements in rotated sorted order : ");
        for (int i=0;i<number;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Index of smallest element : "+FindRotationPoint.binarySearch(array));
    }
}
