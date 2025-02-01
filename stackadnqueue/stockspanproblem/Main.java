package stackadnqueue.stockspanproblem;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        StockSpanner object=new StockSpanner();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of days : ");
        int days=sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(days);
        for(int i=0;i<days;i++){
            System.out.println("Enter value of stock for day"+(i+1));
            arr.add(sc.nextInt());
        }
        ArrayList<Integer> span = object.calculateSpan(arr);

        for (int x : span) {
            System.out.print(x + " ");
        }
    }
}
