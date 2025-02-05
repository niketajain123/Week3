package stringbuffer.concatenatestrings;

public class ConcatenateStrings {
    public static String concatenateStrings(String[]strings){
        StringBuffer buffer=new StringBuffer();
        for(String string:strings){
            buffer.append(string);
        }
        return buffer.toString();
    }
}
