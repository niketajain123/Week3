package linearsearch.searchspecificword;

public class SearchWord {
    public static String searchSpecificWord(String[]sentences,String wordToSearch){
        String result="Not Found";
        for(String sentence : sentences){
            String[]words=sentence.split(" ");
            for(String word : words ){
                if(word.equals(wordToSearch)) {
                    result="Word "+wordToSearch+" found in sentence : "+sentence;
                    return result;
                }
            }

        }
        return result;
    }
}
