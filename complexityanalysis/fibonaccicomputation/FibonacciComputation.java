package complexityanalysis.fibonaccicomputation;

public class FibonacciComputation {
    public void compareFibonacci(int n){
        long startTime,endTime;
        startTime=System.nanoTime();
        fibonacciRecursive(n);
        endTime=System.nanoTime();
        System.out.println("Time taken by recursive fibonacci : "+(endTime-startTime));
        startTime=System.nanoTime();
        fibonacciIterative(n);
        endTime=System.nanoTime();
        System.out.println("Time taken by iterative fibonacci : "+(endTime-startTime));
    }
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    public static int fibonacciIterative(int n) {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }


}
