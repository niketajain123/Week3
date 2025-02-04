package linearsearch.searchspecificword;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of sentences : ");
        int number=sc.nextInt();
        sc.nextLine();
        String[]sentences=new String[number];
        for(int i=0;i<number;i++){
            System.out.println("Enter sentence : ");
            sentences[i]=sc.nextLine();
        }
        System.out.println("Enter word to be searched : ");
        String word=sc.next();
        String result=SearchWord.searchSpecificWord(sentences,word);
        System.out.println(result);
    }
}
