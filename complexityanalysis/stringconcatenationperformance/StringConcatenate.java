package complexityanalysis.stringconcatenationperformance;

public class StringConcatenate {
    public long concatenateStrings(String string){
        String concatenatedString="";
        long endTime;
        long startTime=System.nanoTime();
        for(int i=0;i<10000;i++){
            concatenatedString+=string;
        }
        endTime=System.nanoTime();
        return endTime-startTime;
    }
    public long concatenateStringsBuffer(String string){
        StringBuffer stringBuffer=new StringBuffer("");
        long endTime;
        long startTime=System.nanoTime();
        for(int i=0;i<10000;i++){
           stringBuffer.append(string);
        }
        endTime=System.nanoTime();
        return endTime-startTime;
    }
    public long concatenateStringsBuilder(String string){
        StringBuilder stringBuilder=new StringBuilder("");
        long endTime;
        long startTime=System.nanoTime();
        for(int i=0;i<10000;i++){
            stringBuilder.append(string);
        }
        endTime=System.nanoTime();
        return endTime-startTime;
    }
}
