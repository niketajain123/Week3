package stringbuilder.reversestring;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String original=sc.nextLine();
        String reverse=ReverseString.reverseString(original);
        System.out.println("Reverse : "+reverse);
    }
}
