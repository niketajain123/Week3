package stackadnqueue.slidingwindowmaximum;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        SlidingWindowMaximum swm = new SlidingWindowMaximum();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter "+n+" values...");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter size of window...");
        int k = sc.nextInt();
        int[] result = swm.maxSlidingWindow(nums, k);

        System.out.print("Sliding Window Maximum: ");
        for (int max : result) {
            System.out.print(max + " ");
        }
    }
}
