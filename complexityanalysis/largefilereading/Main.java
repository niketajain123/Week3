package complexityanalysis.largefilereading;

public class Main {
    public static void main(String[] args) {
        String filePath="D:\\CapgTrainingAssignments\\laptop.jpg";
        ReadingFile readingFile=new ReadingFile();
        readingFile.compareFileReaderAndInputStreamReader(filePath);
    }
}
