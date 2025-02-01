package sortingalgorithms.sortproductprices;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortProductPrices sortPrice = new SortProductPrices();

        System.out.print("Enter the number of product prices: ");
        int n = sc.nextInt();

        double[] prices = new double[n];
        System.out.print("Enter the product prices: ");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextDouble();
        }

        sortPrice.quickSort(prices, 0, n - 1);

        System.out.println("Sorted product prices: " + Arrays.toString(prices));

    }
}
