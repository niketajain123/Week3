package linearsearch.searchfirstnegative;

public class FindFirstNegative {
    public static int linearSearch(int[]arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0)
                return i;
        }
        return -1;
    }
}
