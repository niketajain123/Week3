package hashmapandfunction.checkpair;
import java.util.*;

public class CheckPair {
    public boolean hasPairWithSum(int[] nums, int target) {
        Set<Integer> seenNumbers = new HashSet<>();

        for (int num : nums) {
            int complement = target - num;

            if (seenNumbers.contains(complement)) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                return true;
            }

            seenNumbers.add(num);
        }

        return false;
    }
}
