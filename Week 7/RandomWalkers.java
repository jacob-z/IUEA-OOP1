/*
RandomWalkers.java

Thomas Gwozdz

This program simulates a random walker for N
steps and calculates the distance they travel. It runs this
experiment t times and calculates the average distance a
walker travels in t experiments. N and t are command line
argument integers.
*/

public class RandomWalkers {

    public static void main(String[] args) {

        // number of steps
        int n = Integer.parseInt(args[0]);
        // number of trials
        int t = Integer.parseInt(args[1]);
        double avg = 0; // average distance through all trials

        // for t number of trials...
        for (int v = 0; v < t; v++) {
            
            int x = 0; // walker's current horizontal position
            int y = 0; // walker's current vertical position

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
            }
            avg = avg + Math.sqrt(x*x + y*y);;
        }
        avg = avg/t;
        System.out.println("Average distance: " + avg);
    }
}
