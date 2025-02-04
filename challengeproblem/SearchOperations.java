package challengeproblem;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchOperations {
    public static int findFirstMissingPositiveInteger(ArrayList<Integer> list){
        int size=list.size();
        int max=1;
        for(int i=0;i<size;i++){
            if(list.get(i)>max)
                max=list.get(i);
        }
        int[]arr=new int[max];
        for(int i=0;i<size;i++){
            int x=list.get(i);
            if(x>0)
                arr[x-1]=1;
            else
                continue;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                return i+1;
        }
        return -1;
    }
    public static int findIndex(ArrayList<Integer>list,int target){
        int[]numbers=new int[list.size()];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=list.get(i);
        }
        Arrays.sort(numbers);
        int left=0;
        int right=numbers.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(numbers[mid]==target){
                return mid;
            }
            if(numbers[mid]>target)
                right=mid-1;
            else if (numbers[mid]<target) {
                left=mid+1;
            }
        }
        return -1;
    }
}
