package stringbuffer.comparestringbufferandbuilder;

public class CompareStringBufferAndBuilder {
    public static void comparePerformance(String string){
        StringBuffer buffer=new StringBuffer();
        StringBuilder builder=new StringBuilder();
        long startTime=System.nanoTime();
        for(int i=1;i<1000000;i++){
            buffer.append(string);
        }
        long endTime=System.nanoTime();
        System.out.println("Time taken by StringBuffer : "+(endTime-startTime));
        startTime=System.nanoTime();
        for(int i=1;i<1000000;i++){
            builder.append(string);
        }
        endTime=System.nanoTime();
        System.out.println("Time taken by StringBuilder : "+(endTime-startTime));


    }
}
