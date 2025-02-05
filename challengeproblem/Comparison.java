package challengeproblem;

import java.io.*;
import java.util.ArrayList;

public class Comparison {
    public static void compareStringBuilderAndStringBuffer(ArrayList<String> strings) {
        StringBuffer buffer = new StringBuffer();
        StringBuilder builder = new StringBuilder();
        long startTime, endTime;
        long timeStringBuffer, timeStringBuilder;
        startTime = System.nanoTime();
        for (String string : strings) {
            for (int i = 0; i < 1000000; i++) {
                buffer.append(string);
            }
        }
        endTime = System.nanoTime();
        timeStringBuffer = endTime - startTime;
        startTime = System.nanoTime();
        for (String string : strings) {
            for (int i = 0; i < 1000000; i++) {
                builder.append(string);
            }
        }
        endTime = System.nanoTime();
        timeStringBuilder = endTime - startTime;
        System.out.println("Time taken by StringBuffer : " + timeStringBuffer);
        System.out.println("Time taken by StringBuilder : " + timeStringBuilder);
        if (timeStringBuffer < timeStringBuilder)
            System.out.println("StringBuffer is faster!");
        else
            System.out.println("StringBuilder is faster!");

    }

    public static void compareFileReaderAndInputStreamReader(String filePath) {
        long startTime, endTime, timeFileReader = 0, timeInputStreamReader = 0;
        int wordCount = 0;

        try (FileReader fileReader = new FileReader(filePath);
             FileInputStream fileInputStream = new FileInputStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        ) {
            int ch;
            startTime = System.nanoTime();
            while ((ch = fileReader.read()) != -1) ;
            endTime = System.nanoTime();
            timeFileReader = endTime - startTime;
            startTime = System.nanoTime();
            while ((ch = inputStreamReader.read()) != -1) ;
            endTime = System.nanoTime();
            timeInputStreamReader = endTime - startTime;
            String line;
            try (FileInputStream fis = new FileInputStream(filePath);
                 InputStreamReader isr = new InputStreamReader(fis);
                 BufferedReader bufferedReader = new BufferedReader(isr);
            ) {
                while ((line = bufferedReader.readLine()) != null) {
                    wordCount += line.split(" ").length;
                }
            } catch (IOException ex) {
                System.out.println("Error in counting words!");
                System.out.println(ex.getMessage());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Time taken by FileReader : " + timeFileReader);
        System.out.println("Time taken by InputStreamReader : " + timeInputStreamReader);
        if (timeFileReader < timeInputStreamReader)
            System.out.println("FileReader is faster!");
        else
            System.out.println("InputStreamReader is faster!");
        System.out.println("Total number of words : " + wordCount);

    }
}
