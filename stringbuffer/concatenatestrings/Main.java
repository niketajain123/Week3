package stringbuffer.concatenatestrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of strings to be entered : ");
        int number=sc.nextInt();
        String[]strings=new String[number];
        for(int i=0;i<strings.length;i++){
            System.out.print("Enter a string : ");
            strings[i]=sc.next();
        }
        String concatenatedString=ConcatenateStrings.concatenateStrings(strings);
        System.out.println("After concatenating all strings : ");
        System.out.println(concatenatedString);
    }
}
