package complexityanalysis.comparingdatastuctures;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CompareDataStructures cpm=new CompareDataStructures();
        int[]arr=new int[10000];
        for(int i=0;i<10000;i++){
            if(i%2==0)
                arr[i]=i+1;
            else
                arr[i]=i+2;
        }
        System.out.println("Array created...");
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i=0;i<10000;i++){
            hashSet.add(i+1);
        }
        System.out.println("HashSet created...");
        TreeSet<Integer> treeSet=new TreeSet<>();
        for(int i=0;i<10000;i++){
            treeSet.add(i+1);
        }
        System.out.println("TreeSet created...");
        System.out.print("Enter target to search : ");
        int target=sc.nextInt();
        System.out.println("Time taken by Array in searching : "+cpm.arrayPerformance(arr,target));
        System.out.println("Time taken by HashSet in searching : "+cpm.hashSetPerformance(hashSet,target));
        System.out.println("Time taken by TreeSet in searching : "+cpm.treeSetPerformance(treeSet,target));
    }
}
