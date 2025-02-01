package stackadnqueue.circulartourproblem;
import java.util.*;
public class CircularTour {
    public int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        int start = 0;
        int totalSurplus = 0;
        int currentSurplus = 0;
        for (int i = 0; i < n; i++) {
            int fuelBalance = petrol[i] - distance[i];
            totalSurplus += fuelBalance;
            currentSurplus += fuelBalance;
             if (currentSurplus < 0) {
                start = i + 1;
                currentSurplus = 0;
            }
        }

       return (totalSurplus >= 0) ? start : -1;
    }
}
