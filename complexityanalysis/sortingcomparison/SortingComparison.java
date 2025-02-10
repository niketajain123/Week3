package complexityanalysis.sortingcomparison;

public class SortingComparison {
    public void bubbleSort(int[]arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped=false;
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }
    }
    public void mergeSort(int[]arr,int left,int right){
        if (left < right) {
            int mid = (right + left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, right);
        }
    }
    public void merge(int[]arr,int left,int right){
        int mid=(left+right)/2;
        int first=left,sec=mid+1;
        int pos=0;
        int[]brr=new int[right-left+1];
        while (first<=mid&&sec<=right){
            if(arr[first]<=arr[sec]){
                brr[pos]=arr[first];
                first++;
            }
            else {
                brr[pos]=arr[sec];
                sec++;
            }
            pos++;
        }
        while (first<=mid){
            brr[pos]=arr[first];
            first++;
            pos++;
        }
        while (sec<=right){
            brr[pos]=arr[sec];
            sec++;
            pos++;
        }
        for(int j=0,k=left;j< brr.length;j++,k++){
            arr[k]=brr[j];
        }
    }
    public void quickSort(int []arr,int low,int high){
        if(low<high){
            int j=partition(arr, low, high);
            quickSort(arr,low,j);
            quickSort(arr,j+1,high);
        }
    }
    public int partition(int[]arr,int low,int high){
        int pivot=arr[low];
        int i=low,j=high;
        do{
            do{
                i++;
            }while (arr[i]<=pivot);
            do{
                j--;
            }while (arr[j]>pivot);
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }while (i<j);
        int temp=arr[j];
        arr[j]=arr[low];
        arr[low]=temp;
        return j;
    }
    public void compareSortingAlgorithms(int[]arr){
        int start=0;
        int end=arr.length-1;
        long startTime,endTime,bubbleSortTime,mergeSortTime,quickSortTime;
        startTime=System.nanoTime();
        bubbleSort(arr);
        endTime=System.nanoTime();
        bubbleSortTime=endTime-startTime;
        startTime=System.nanoTime();
        mergeSort(arr,start,end);
        endTime=System.nanoTime();
        mergeSortTime=endTime-startTime;
        startTime=System.nanoTime();
        quickSort(arr,start,end);
        endTime=System.nanoTime();
        quickSortTime=endTime-startTime;
        System.out.println("Time taken by bubble sort : "+bubbleSortTime);
        System.out.println("Time taken by merge sort : "+mergeSortTime);
        System.out.println("Time taken by quick sort : "+quickSortTime);
    }

}
