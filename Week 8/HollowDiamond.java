/*
Thomas Gwozdz
from class on July 20 2017

This program prints out a hollow diamond.
*/

public class HollowDiamond {
    
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n % 2 == 0) {
            System.out.println("n needs to be odd.");
            return;
        }

        // top part of diamond
        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < n/2 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i*2 + 1; k++) {
                if (k > 0 && k < i*2)
                    System.out.print("  ");
                else
                    System.out.print(" *");
            }
            System.out.print("\n");
        }

        // middle part of diamond
        for (int m = 0; m < n; m++) {
            if (m > 0 && m < n-1)
                System.out.print("  ");
            else
                System.out.print(" *");
        }
        System.out.print("\n");

        // bottom part of diamond
        for (int i = n/2 - 1; i >= 0; i--) {
            for (int j = 0; j < n/2 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i*2 + 1; k++) {
                if (k > 0 && k < i*2)
                    System.out.print("  ");
                else 
                    System.out.print(" *");
            }
            System.out.print("\n");
        }
    }
}