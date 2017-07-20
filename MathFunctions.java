/*
Thomas Gwozdz
with OOP1
July 20, 2017

This class implements a few basic math functions.
*/

public class MathFunctions {
    
    // returns a plus b
    public static int add(int a, int b) {
        return a + b;
    }

	// returns a minus b
    public static int sub(int a, int b) {
        return a - b;
    }

	// returns the absolute value of a
    public static int absolute(int a) {
        if (a < 0) {
            return a - 2*a;
        }
        else
            return a;
    }

	// returns a times b
    public static int mult(int a, int b) {
        return a * b;
    }

	// returns a divided by b
	// prints error if b is 0
    public static double div(double a, double b) {
        if ((int) b == 0) {
            System.out.println("error: divide by 0");
            return 0.0;
        }
        else 
            return a / b;
    }

	// returns a to the power of b
    public static double exp(int a, int b) {
        int answer = 1;
        for (int i = 0; i < absolute(b); i++) {
            answer = answer * a;
        }
        if (b < 0)
            return 1.0 / (double) answer;
        else 
            return (double) answer;
    }

	// testing
    public static void main(String[] args) {
        System.out.println("Welcome to Math!");
        System.out.println("6+9 =        " + add(6, 9));    // 15
        System.out.println("-6+9 =       " + add(-6, 9));   // 3
        System.out.println("-10+(-9) =   " + add(-10, -9)); // -19
        System.out.println("-10-(-9) =   " + sub(-10, -9)); // -1
        System.out.println("100-100 =    " + sub(100, 100));// 0
        System.out.println("-1-0 =       " + sub(-1, 0));   // -1
        System.out.println("31/10 =      " + div(31, 10));  // 3.1
        System.out.println("10/30 =      " + div(10, 30));  // 0.33333333333
        System.out.println("100/25 =     " + div(100, 25)); // 4
        System.out.println("4^2 =        " + exp(4, 2));    // 16
        System.out.println("3^0 =        " + exp(3, 0));    // 1
        System.out.println("3^-2 =       " + exp(3, -2));   // 0.1111111111
        System.out.println("(3+6)*5+17 = " + add(mult(add(3,6), 5), 17));  // 62
    }
}