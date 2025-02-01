package stackadnqueue.queueusingstack;

import java.util.Stack;

public class Queue {
    private Stack<Integer> stack1=new Stack<>();
    private Stack<Integer> stack2=new Stack<>();
    public void enqueue(int x){
        stack1.push(x);
        System.out.println(x+ " enqueued!");
    }
    public int dequeue(){
        if(stack1.empty()){
            System.out.println("Queue underflow...");
            return 0;
        }
        while (!stack1.empty()){
            stack2.push(stack1.pop());
        }
        int item=stack2.pop();
        while (!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return item;
    }
    public int peek(){
        if(stack1.empty()){
            System.out.println("Queue underflow...");
            return 0;
        }
        while (!stack1.empty()){
            stack2.push(stack1.pop());
        }
        int item=stack2.peek();
        while (!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return item;
    }
    public boolean isEmpty(){
        return stack1.empty();
    }
}
