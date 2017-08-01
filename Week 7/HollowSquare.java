/*
Thomas Gwozdz
from class on July 20 2017

This program prints out a hollow square. This program
takes a command line argument N (an integer) which is the
width (and height) of the square.
*/

public class HollowSquare {
    
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // inside square vertically
                if (i > 0 && i < n - 1) {
                    // inside square horizontally
                    if (j > 0 && j < n - 1)
                        System.out.print("  ");
                    else 
                        System.out.print(" *");
                }
                // top or bottom of square (not inside vertically)
                else
                    System.out.print(" *");
            }
            System.out.print("\n");
        }
    }
}