package binarysearch.findpeakelement;

public class FindPeakElement {
    public static void findPeak(int[]numbers){
        int left=0;
        int right=numbers.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(mid>0&&mid<numbers.length-1) {
                if (numbers[mid] > numbers[mid - 1] && numbers[mid] > numbers[mid + 1]) {
                    System.out.println("Peak element : " + numbers[mid]);
                    return;
                }
                if (numbers[mid] < numbers[mid - 1])
                    right = mid-1;
                else if (numbers[mid] < numbers[mid + 1])
                    left = mid+1;
            }
            else
                break;
        }
        System.out.println("No peak is found");
        return;
    }
}
