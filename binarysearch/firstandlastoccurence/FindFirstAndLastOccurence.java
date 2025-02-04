package binarysearch.firstandlastoccurence;

public class FindFirstAndLastOccurence {
    public static int findFirstOccurence(int[]numbers,int target){
        int left=0;
        int right=numbers.length-1;
        int firstOccurence=-1;
        int mid;
        while(left<=right){
            mid=(left+right)/2;
            if(numbers[mid]==target){
                firstOccurence=mid;
                right=mid-1;
            }
            else if(numbers[mid]<target)
                left=mid+1;
            else if(numbers[mid]>target)
                right=mid-1;

        }
        return firstOccurence;
    }
    public static int findLastOccurence(int[]numbers,int target){
        int left=0;
        int right=numbers.length-1;
        int lastOccurence=-1;
        int mid;
        while(left<=right){
            mid=(left+right)/2;
            if(numbers[mid]==target){
                lastOccurence=mid;
                left=mid+1;
            }
            else if(numbers[mid]<target)
                left=mid+1;
            else if(numbers[mid]>target)
                right=mid-1;

        }
        return lastOccurence;
    }
}
