package complexityanalysis.comparingdatastuctures;

import java.util.HashSet;
import java.util.TreeSet;

public class CompareDataStructures {
    public long arrayPerformance(int[]arr,int target){
        boolean flag=false;
        long startTime=System.nanoTime();
        for(int x : arr){
            if(target==x){
                flag=true;
                break;
            }
        }
        long endTime=System.nanoTime();
        return endTime-startTime;
    }
    public long hashSetPerformance(HashSet<Integer> set, int target){
        boolean flag=false;
        long startTime=System.nanoTime();
        flag=set.contains(target);
        long endTime=System.nanoTime();
        return endTime-startTime;
    }
    public long treeSetPerformance(TreeSet<Integer> set, int target){
        boolean flag=false;
        long startTime=System.nanoTime();
        flag=set.contains(target);
        long endTime=System.nanoTime();
        return endTime-startTime;
    }
}
