package filereader;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLine {
    public static void main(String[] args) {
        try(FileReader file=new FileReader("D:\\CapgTrainingAssignments\\javaNotes.txt")) {
            BufferedReader bufferedReader = new BufferedReader(file);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException ex){
            System.err.print(ex.getMessage());
        }
    }
}
