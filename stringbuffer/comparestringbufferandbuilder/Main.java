package stringbuffer.comparestringbufferandbuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String string=sc.next();
        System.out.println("======================================");
        CompareStringBufferAndBuilder.comparePerformance(string);
    }
}
