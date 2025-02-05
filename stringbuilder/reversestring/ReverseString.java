package stringbuilder.reversestring;

public class ReverseString {
   public static String reverseString(String original){
       StringBuilder string=new StringBuilder();
       for(int i=0;i<original.length();i++){
           string.append(original.charAt(i));
       }
       string=string.reverse();
       String reverse=string.toString();
       return reverse;
   }

}
