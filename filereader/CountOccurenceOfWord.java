package filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountOccurenceOfWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to be counted : ");
        String string=sc.next();
        int count=0;
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader("D:\\CapgTrainingAssignments\\javaNotes.txt"))){
            String line;
            while((line=bufferedReader.readLine())!=null){
            String[]arr=line.split(" ");
            for(String word:arr){
                if(word.equals(string))
                    count++;
            }
            }

        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }
        System.out.println("Word "+string+" occured "+count+" times in file.");
    }
}
