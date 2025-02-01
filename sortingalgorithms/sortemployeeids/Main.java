package sortingalgorithms.sortemployeeids;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortEmployeeIds employeeIds = new SortEmployeeIds();
        System.out.print("Enter number of employees : ");
        int number = sc.nextInt();
        int[] employeeId = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter id of employee" + (i+1) + " : ");
            employeeId[i] = sc.nextInt();
        }
        System.out.println("Ids before sorting : ");
        System.out.println(Arrays.toString(employeeId));
        employeeIds.insertionSort(employeeId);
        System.out.println("Ids after sorting : ");
        System.out.println(Arrays.toString(employeeId));
    }

}
