package hashmapandfunction.findallsubarrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FindAllSubarrays finder = new FindAllSubarrays();
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        List<int[]> result = finder.findZeroSumSubarrays(nums);

        if (result.isEmpty()) {
            System.out.println("No zero-sum subarrays found.");
        } else {
            System.out.println("Zero-sum subarrays (startIndex, endIndex):");
            for (int[] subarray : result) {
                System.out.println(Arrays.toString(subarray));
            }
        }

        scanner.close();
    }
}
