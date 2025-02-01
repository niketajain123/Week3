package hashmapandfunction.longestconsecutivesequence;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LongestConsecutiveSequence finder = new LongestConsecutiveSequence();

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int longestSequence = finder.findLongestConsecutiveSequence(nums);
        System.out.println("Length of the longest consecutive sequence: " + longestSequence);

        scanner.close();
    }
}
