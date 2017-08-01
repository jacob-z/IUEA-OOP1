/*
RandomWalker.java

Thomas Gwozdz

This program simulates a random walker for N
steps and calculates the distance they travel at the end
and the farthest distance they get. N is a command line 
argument integer.
*/

public class RandomWalker {

    public static void main(String[] args) {

        // number of steps
        int n = Integer.parseInt(args[0]); 
        int x = 0; // walker's current horizontal position
        int y = 0; // walker's current vertical position
        double d = 0; // distance at current position
        double f = 0; // farthest distance during walk

        // print out starting position
        System.out.println("(" + x + ", " + y + ")");

        // take n number of steps...
        for (int q = 0; q < n; q++) {
            double r = Math.random(); // [0, 1)

            // move north
            if (r < 0.25) {
                y++;
            }

            // move south
            else if (r >= 0.25 && r < 0.5) {
                y--;
            }

            // move east
            else if (r >= 0.5 && r < 0.75) {
                x++;
            }

            // move west
            else {
                x--;
            }

            // print out new position
            System.out.println("(" + x + ", " + y + ")");

            d = Math.sqrt(x*x + y*y);
            if (d > f) {
                f = d;
            }
        }

        System.out.println("Farthest distance: " + f);
        System.out.println("Current distance:  " + d);
    }
}
