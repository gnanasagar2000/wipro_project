public class fibonacci {
    public static int Fibonacci(int n) {
        if (n<=1)
            return n;
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    public static int[] generateFibonacciArray(int n) {
        int[] fibonacciArray=new int[n];
        for (int i=0;i<n;i++) {
            fibonacciArray[i] = Fibonacci(i);
        }
        return fibonacciArray;
    }
    
    public static void main(String[] args) {
        int n = 25;
        int[] fibonacciArray = generateFibonacciArray(n);
        System.out.println("First "+n+" Fibonacci numbers:");
        for (int num:fibonacciArray) {
            System.out.print(num+" ");
        }
        int nthFibonacci=Fibonacci(n-1);
        System.out.println("\n\nThe "+n+"th Fibonacci number is: "+nthFibonacci);
    }
}
