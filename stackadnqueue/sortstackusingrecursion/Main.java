package stackadnqueue.sortstackusingrecursion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SortStack s=new SortStack();
        int x;
        do {
            System.out.println("Enter non-zero value to push and 0 to stop!");
            x = sc.nextInt();
            if (x == 0)
                break;
            else
                s.push(x);
        }while (x!=0);
        System.out.println("Original stack...");
        s.display();
        s.sort();
        System.out.println(s.isEmpty());
        System.out.println("Sorted stack...");
        s.display();

    }
}
