package challengeproblem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int size=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<size;i++){
            System.out.print("Enter element : ");
            list.add(sc.nextInt());
        }
        System.out.println("First missing positive integer : "+SearchOperations.findFirstMissingPositiveInteger(list));
        System.out.println("Enter target element to find : ");
        int target=sc.nextInt();
        System.out.println("After sorting...");
        int index=SearchOperations.findIndex(list,target);
        if(index==-1)
            System.out.println(target+" is not present!");
        else
        System.out.println("Index of "+target+" : "+index);
    }
}
