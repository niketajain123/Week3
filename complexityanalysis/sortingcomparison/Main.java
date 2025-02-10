package complexityanalysis.sortingcomparison;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Enter number of elements : ");
        int size= sc.nextInt();
        int[]arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]= random.nextInt(10000);
        }
        SortingComparison sortingComparison=new SortingComparison();
        sortingComparison.compareSortingAlgorithms(arr);
    }
}
