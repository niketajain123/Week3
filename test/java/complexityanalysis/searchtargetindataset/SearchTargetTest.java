package complexityanalysis.searchtargetindataset;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchTargetTest {

    @Test
    void linearSearchAnalysisForTwo() {
        SearchTarget search=new SearchTarget();
        int[]arr={2,5,1,6,3};
        int target=2;
        boolean result= search.linearSearchAnalysis(arr,target);
        assertEquals(true,result);
    }
    @Test
    void linearSearchAnalysisForFour() {
        SearchTarget search=new SearchTarget();
        int[]arr={2,5,1,6,3};
        int target=4;
        boolean result= search.linearSearchAnalysis(arr,target);
        assertEquals(false,result);
    }

    @Test
    void binarySearchAnalysisForSeven() {
        SearchTarget search=new SearchTarget();
        int[]arr={2,5,1,6,3};
        int target=7;
        boolean result= search.binarySearchAnalysis(arr,target);
        assertEquals(false,result);
    }
    @Test
    void binarySearchAnalysisForFive() {
        SearchTarget search=new SearchTarget();
        int[]arr={2,5,1,6,3};
        int target=5;
        boolean result= search.binarySearchAnalysis(arr,target);
        assertEquals(true,result);
    }
    @Test
    void binarySearchAnalysisForTwo() {
        SearchTarget search=new SearchTarget();
        int[]arr={2,5,1,6,3};
        int target=2;
        boolean result= search.binarySearchAnalysis(arr,target);
        assertEquals(true,result);
    }
    @Test
    void binarySearchAnalysisForOne() {
        SearchTarget search=new SearchTarget();
        int[]arr={2,5,1,6,3};
        int target=1;
        boolean result= search.binarySearchAnalysis(arr,target);
        assertEquals(true,result);
    }
    @Test
    void binarySearchAnalysisForSix() {
        SearchTarget search=new SearchTarget();
        int[]arr={2,5,1,6,3};
        int target=6;
        boolean result= search.binarySearchAnalysis(arr,target);
        assertEquals(true,result);
    }
    @Test
    void binarySearchAnalysisForThree() {
        SearchTarget search=new SearchTarget();
        int[]arr={2,5,1,6,3};
        int target=3;
        boolean result= search.binarySearchAnalysis(arr,target);
        assertEquals(true,result);
    }
}