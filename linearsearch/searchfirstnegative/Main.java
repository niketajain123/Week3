package linearsearch.searchfirstnegative;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int number=sc.nextInt();
        int[]arr=new int[number];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter number : ");
            arr[i]= sc.nextInt();
        }
        int x=FindFirstNegative.linearSearch(arr);
        if(x==-1)
            System.out.println("Negative number not found!");
        else
            System.out.println("First negative number index : "+x);
    }
}
