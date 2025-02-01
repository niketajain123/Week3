package sortingalgorithms.sortstudentages;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortStudentAges sortAges = new SortStudentAges();

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] ages = new int[n];
        System.out.print("Enter the students' ages (10 to 18): ");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }
        sortAges.countingSort(ages);
        System.out.println("Sorted student ages: " + Arrays.toString(ages));
    }
}
