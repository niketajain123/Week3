package complexityanalysis.largefilereading;

import java.io.*;

public class ReadingFile {
    public long readingByFilReader(String filePath){
        long startTime,endTime;
        startTime=System.nanoTime();
        try(FileReader fileReader=new FileReader(filePath);){
            int ch;
            while((ch= fileReader.read())!=-1);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        endTime=System.nanoTime();
        return endTime-startTime;
    }
    public long readingByInputStreamReader(String filePath){
        long startTime,endTime;
        startTime=System.nanoTime();
        try(FileInputStream fileInputStream=new FileInputStream(filePath);
            InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);){
            int ch;
            while ((ch=inputStreamReader.read())!=-1);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        endTime=System.nanoTime();
        return endTime-startTime;
    }
    public void compareFileReaderAndInputStreamReader(String filePath){
        long timeByFileReader=readingByFilReader(filePath);
        long timeByInputStreamReader=readingByInputStreamReader(filePath);
        System.out.println("Time taken by FileReader : "+timeByFileReader);
        System.out.println("Time taken by InputStreamReader : "+timeByInputStreamReader);
    }
}
