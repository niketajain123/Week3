package binarysearch.searcttargetintwodmatrix;

public class SearchTargetInTwoDMatrix {
    public static boolean binarySearch(int[][]matrix,int target){
        int rows=matrix.length;
        int columns=matrix[0].length;
        int left=0;
        int right=rows*columns-1;
        while(left<=right){
            int mid = (left+right)/2;
            int row=mid/columns;
            int column=mid%columns;
            if(target==matrix[row][column]){
                return true;
            }
            if(matrix[row][column]>target)
                right=mid-1;
            else if(target>matrix[row][column])
                left=mid+1;
        }
        return false;
    }
}
