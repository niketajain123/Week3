package inputstreamreader.readandwriteuserinput;

import java.io.*;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class ReadAndWriteToFile {
    public static void readAndWriteToFile(String filePath){
        try(
        InputStreamReader inputStream=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStream);
        FileWriter fileWriter=new FileWriter(filePath);){
            String br;
            while(true){
                br=bufferedReader.readLine();
                if(br.equals("exit"))
                    break;
                fileWriter.write(br);
                fileWriter.write(System.lineSeparator());
            }
        }

        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
