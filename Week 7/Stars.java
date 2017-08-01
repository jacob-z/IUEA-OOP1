/******************************************************************************
 *  Author: Jacob Zimmer
 *
 *  Prints a pattern of stars with n^2 asterisks total and n asterisks per row.
 *  n is a command line argument integer.
 *
 *  % java Stars 5
 *  * * * * * 
 *   * * * * * 
 *  * * * * * 
 *   * * * * * 
 *  * * * * * 
 ******************************************************************************/

public class Stars {
    public static void main(String[]args) {

        //Check for correct number of arguments
        if (args.length != 1) {
            System.out.println("Usage: java Stars n\nn is an integer ≥ 0.");
            System.exit(2);
        }

        //Read the command-line argument
        int n = Integer.parseInt(args[0]);
        if (n < 0) {
            System.out.println("Input must be a positive integer");
        }
        //This level of the for loop moves from row to row using the count 
        //variable
        for (int row = 0; row < n; row++) {  
            //Offset every other row by 1 space
            if (row % 2 == 1) {
                System.out.print(" ");
            }              
            //This level fills in each row with asterisks
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            //Print a return at the end of each line                
            System.out.print("\n");
            
        }
    }
}