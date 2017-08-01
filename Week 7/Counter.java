/*
Thomas Gwozdz

Counter.java

This program sums the numbers from 1 to N, and 
also calculates the closed-form answer for the sum.
N is given as command line argument.
*/

public class Counter {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;

        // sums from 1 to n
        for (int i = 1; i <= n; i++) {
            x = x + i;
        }
        System.out.println("x = " + x);

        // closed-form equation for sum from 1 to n
        y = (n * (n + 1)) / 2;
        System.out.println("y = " + y);

        if (x != y) {
            System.out.println("This program is wrong.");
        }
    }
}
