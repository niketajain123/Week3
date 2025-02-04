package binarysearch.searcttargetintwodmatrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows=sc.nextInt();
        System.out.println("Enter number of columns : ");
        int columns=sc.nextInt();
        int[][]matrix=new int[rows][columns];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print("Enter matrix["+i+"]["+j+"] : ");
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter a target : ");
        int target=sc.nextInt();
        System.out.println("Is "+target+" present in matrix : "+SearchTargetInTwoDMatrix.binarySearch(matrix,target));
    }
}
