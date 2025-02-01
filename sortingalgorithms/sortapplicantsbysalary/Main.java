package sortingalgorithms.sortapplicantsbysalary;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortApplicantsSalary sortSalary= new SortApplicantsSalary();

        System.out.print("Enter the number of applicants: ");
        int n = sc.nextInt();

        double[] salaries = new double[n];
        System.out.print("Enter the expected salaries: ");
        for (int i = 0; i < n; i++) {
            salaries[i] = sc.nextDouble();
        }

        sortSalary.heapSort(salaries);

        System.out.println("Sorted salary demands: " + Arrays.toString(salaries));
    }
}
