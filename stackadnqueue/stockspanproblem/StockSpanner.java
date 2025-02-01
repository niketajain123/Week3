package stackadnqueue.stockspanproblem;
import java.util.*;
public class StockSpanner {
      public ArrayList<Integer> calculateSpan(
                ArrayList<Integer> arr) {

          int n = arr.size();
          ArrayList<Integer> span = new ArrayList<>(
                  Collections.nCopies(n, 0));
          Stack<Integer> stk = new Stack<>();

          for (int i = 0; i < n; i++) {

              while (!stk.isEmpty() && arr.get(stk.peek())
                      <= arr.get(i)) {
                  stk.pop();
              }

               if (stk.isEmpty()) {
                  span.set(i, (i + 1));
              } else {
                  span.set(i, (i - stk.peek()));
              }

              stk.push(i);
          }

          return span;
      }
}
