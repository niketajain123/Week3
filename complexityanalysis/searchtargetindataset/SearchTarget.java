package complexityanalysis.searchtargetindataset;

import java.util.Arrays;

public class SearchTarget {
    public boolean linearSearchAnalysis(int[]arr,int target){
        boolean flag=false;
        long startTime,endTime;
        startTime=System.nanoTime();
        for(int x:arr){
            if(x==target){
                flag=true;
                break;
            }
        }
        endTime=System.nanoTime();
        System.out.println("Time taken by linear search : "+(endTime-startTime));
        return flag;
    }
    public boolean binarySearchAnalysis(int[]arr,int target){
        Arrays.sort(arr);
        boolean flag=false;
        long startTime,endTime;
        startTime=System.nanoTime();
        int left=0,right=arr.length-1;
        int mid=0;
        while(left<=right){
            mid=(right+left)/2;
            if(arr[mid]==target) {
                flag = true;
                break;
            }
            if(arr[mid]>target){
                right=mid-1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
        }
        endTime=System.nanoTime();
        System.out.println("Time taken by binary search : "+(endTime-startTime));
        return flag;
    }

}
