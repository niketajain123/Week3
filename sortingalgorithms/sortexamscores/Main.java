package sortingalgorithms.sortexamscores;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortExamScores examScores = new SortExamScores();

        System.out.print("Enter the number of exam scores: ");
        int n = sc.nextInt();

        double[] scores = new double[n];
        System.out.print("Enter the exam scores: ");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextDouble();
        }

        examScores.selectionSort(scores);

        System.out.println("Sorted exam scores: " + Arrays.toString(scores));

        sc.close();
    }
}
