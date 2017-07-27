/*
Thomas Gwozdz
From class on July 27, 2017.

Calculates Fibonacci numbers using two different methods.
*/

public class Fibonacci {

    // calculate the nth Fibonacci number using for loops
    public static long fibFor(long n) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        long total = 1;
        long prevTotal = 1;
        long temp = 0;
        for (int i = 2; i <= n; i++) {
            temp = total;
            total = total + prevTotal;
            prevTotal = temp;
        }
        return total;
    }

    // calculate the nth Fibonacci number using recursion
    public static long fibRecur(long n) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        return fibRecur(n-1) + fibRecur(n-2);
    }

    // testing...
    // try changing the fib numbers calculated and examine
    // the timing difference between the two methods
    // (the for method prints first, the recursion method second)
    public static void main(String[] args) {
        System.out.println(fibFor(45));
        System.out.println(fibRecur(45));
    }
}