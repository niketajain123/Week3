package complexityanalysis.comparingdatastuctures;

import complexityanalysis.stringconcatenationperformance.StringConcatenate;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class CompareDataStructuresTest {
    @Test
    public void compareHashSetAndTreeSet(){
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i=0;i<10000;i++){
            hashSet.add(i+1);
        }
        TreeSet<Integer> treeSet=new TreeSet<>();
        for(int i=0;i<10000;i++){
            treeSet.add(i+1);
        }
        int target=9599;
        CompareDataStructures cmp=new CompareDataStructures();
        long hTime=cmp.hashSetPerformance(hashSet,target);
        long tTime= cmp.treeSetPerformance(treeSet,target);
        assertTrue(tTime>hTime);

    }
    @Test
    public void compareArrayAndHashSet(){
        int[]arr=new int[10000];
        for(int i=0;i<10000;i++){
            if(i%2==0)
                arr[i]=i+1;
            else
                arr[i]=i+2;
        }
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i=0;i<10000;i++){
            hashSet.add(i+1);
        }
        int target=9656;
        CompareDataStructures cmp=new CompareDataStructures();
        long aTime=cmp.arrayPerformance(arr,target);
        long hTime= cmp.hashSetPerformance(hashSet,target);
        assertTrue(aTime>hTime);

    }
    @Test
    public void compareArrayAndTreeSet(){
        int[]arr=new int[10000];
        for(int i=0;i<10000;i++){
            if(i%2==0)
                arr[i]=i+1;
            else
                arr[i]=i+2;
        }
        TreeSet<Integer> treeSet=new TreeSet<>();
        for(int i=0;i<10000;i++){
            treeSet.add(i+1);
        }
        int target=9656;
        CompareDataStructures cmp=new CompareDataStructures();
        long aTime=cmp.arrayPerformance(arr,target);
        long tTime= cmp.treeSetPerformance(treeSet,target);
        assertTrue(aTime>tTime);

    }

}