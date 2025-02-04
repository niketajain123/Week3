package binarysearch.findrotationpoint;

public class FindRotationPoint {
    public static int binarySearch(int[]rotatedSortedArray){
        int left=0;
        int right=rotatedSortedArray.length-1;
        int mid=0;
        while(left!=right){
            mid=(left+right)/2;
            if(rotatedSortedArray[mid]>rotatedSortedArray[right])
                left=mid+1;
            else if(rotatedSortedArray[mid]<rotatedSortedArray[right])
                right=mid;
        }
        return left;
    }
}
