package complexityanalysis.stringconcatenationperformance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringConcatenateTest {
    @Test
    public void compareStringAndStringBuffer(){
        StringConcatenate obj=new StringConcatenate();
        long s=obj.concatenateStrings("Hello");
        long sbuffer= obj.concatenateStringsBuffer("Hello");
        assertTrue(s>sbuffer);
    }
    @Test
    public void compareStringAndStringBuilder(){
        StringConcatenate obj=new StringConcatenate();
        long s=obj.concatenateStrings("Hello");
        long sbuilder= obj.concatenateStringsBuilder("Hello");
        assertTrue(s>sbuilder);
    }
    @Test
    public void compareStringBufferAndStringBuilder(){
        StringConcatenate obj=new StringConcatenate();
        long sbuffer=obj.concatenateStringsBuffer("Hello");
        long sbuilder= obj.concatenateStringsBuilder("Hello");
        assertTrue(sbuffer>sbuilder);
    }

}