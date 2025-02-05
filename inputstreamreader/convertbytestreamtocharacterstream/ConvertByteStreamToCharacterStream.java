package inputstreamreader.convertbytestreamtocharacterstream;
import java.io.*;

public class ConvertByteStreamToCharacterStream {
    public static void convertByteToCharacter(String filePath){
        File file=new File(filePath);
        try(FileInputStream fileInputStream=new FileInputStream(file);
            InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader)
            ){
            String line;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }

        }
        catch (UnsupportedEncodingException e) {
            System.out.println("Encoding not supported: " + e.getMessage());
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }


    }
}
