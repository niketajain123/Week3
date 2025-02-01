package stackadnqueue.sortstackusingrecursion;

import java.util.Stack;

public class SortStack {
     private Stack<Integer> stack=new Stack<>();

    public void sort() {
        if (stack.isEmpty()) {
            return; // Base case
        }

        int top = stack.pop(); // Pop top element
        sort(); // Recursively sort remaining stack
        insertInSortedOrder(top); // Insert popped element in sorted order
    }

    private void insertInSortedOrder(int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element); // If stack is empty OR correct position found
            return;
        }

        int top = stack.pop(); // Pop element
        insertInSortedOrder(element); // Recursive call
        stack.push(top); // Push back popped element
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        if (stack.isEmpty())
        {
            System.out.println("Stack underflow...");
            return 0;
        }
        return stack.pop();
    }
    public void display(){
        System.out.println(stack);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
