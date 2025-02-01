package hashmapandfunction.checkpair;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckPair checker = new CheckPair();
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();
        boolean result = checker.hasPairWithSum(nums, target);

        if (!result) {
            System.out.println("No pair with the given sum found.");
        }

        scanner.close();
    }
}
