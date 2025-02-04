package binarysearch.firstandlastoccurence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " sorted elements : ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter target to find occurences :");
        int target = sc.nextInt();
        int firstOccurence = FindFirstAndLastOccurence.findFirstOccurence(numbers, target);
        int lastOccurence=FindFirstAndLastOccurence.findLastOccurence(numbers,target);
        System.out.println("First occurence of "+target+" : "+firstOccurence);
        System.out.println("Last occurence of "+target+" : "+lastOccurence);
    }
}
