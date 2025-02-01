package sortingalgorithms.sortstudentmarks;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortStudentMarks studentMarks = new SortStudentMarks();
        System.out.print("Enter number of students : ");
        int number = sc.nextInt();
        int[] marks = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter marks of student" + i + " : ");
            marks[i] = sc.nextInt();
        }
        System.out.println("Marks before sorting : ");
        System.out.println(Arrays.toString(marks));
        studentMarks.bubbleSort(marks);
        System.out.println("Marks after sorting : ");
        System.out.println(Arrays.toString(marks));
    }

}
