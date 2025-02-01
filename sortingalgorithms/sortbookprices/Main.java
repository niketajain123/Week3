package sortingalgorithms.sortbookprices;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortBookPrices sortPrice = new SortBookPrices();
        System.out.print("Enter the number of book prices: ");
        int n = sc.nextInt();

        double[] prices = new double[n];
        System.out.print("Enter the book prices: ");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextDouble();
        }
        sortPrice.mergeSort(prices, 0, n - 1);

        System.out.println("Sorted book prices: " + Arrays.toString(prices));

    }
}
