package complexityanalysis.stringconcatenationperformance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s=sc.next();
        StringConcatenate obj=new StringConcatenate();
        System.out.println("Time taken in concatenation by String : "+obj.concatenateStrings(s));
        System.out.println("Time taken in concatenation by StringBuffer : "+obj.concatenateStringsBuffer(s));
        System.out.println("Time taken in concatenation by StringBuilder : "+obj.concatenateStringsBuffer(s));
    }
}
