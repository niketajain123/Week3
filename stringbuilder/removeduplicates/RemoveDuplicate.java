package stringbuilder.removeduplicates;

import java.util.HashSet;

public class RemoveDuplicate {
    public static String removeDuplicates(String original){
        StringBuilder builder=new StringBuilder("");
        HashSet<Character>uniqueChars=new HashSet<>();
        for(int i=0;i<original.length();i++){
            char ch=original.charAt(i);
            if(!uniqueChars.contains(ch)){
                builder.append(ch);
                uniqueChars.add(ch);
            }

        }
        return builder.toString();
    }
}
