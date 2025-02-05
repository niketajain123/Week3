package stringbuilder.removeduplicates;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String original=sc.nextLine();
        String duplicatesRemoved=RemoveDuplicate.removeDuplicates(original);
        System.out.println("After removing duplicate characters : "+duplicatesRemoved);
    }
}
