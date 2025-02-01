package hashmapandfunction.twosum;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TwoSum twoSumFinder = new TwoSum();

         System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();
        int[] result = twoSumFinder.findTwoSum(nums, target);

        if (result[0] == -1) {
            System.out.println("No valid pair found.");
        } else {
            System.out.println("Indices of the two numbers: " + Arrays.toString(result));
        }

        sc.close();
    }
}
