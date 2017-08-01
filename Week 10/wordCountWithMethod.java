/******************************************************************************
 * Author: Jacob Zimmer, Thomas Gwozdz
 * wordCount is a program to count the number of words entered to stdin without
 * counting any whitespace characters.  IUEA students should try to see if it
 * is actually correct.
 *****************************************************************************/


import java.util.Scanner;

public class wordCountWithMethod {

	// returns number of words in the string input
    public static int countWords(String input) {
        int numWords = input.trim().split("\\s+").length;
        return numWords;
    }

    public static void main(String[] args) {

        // Make a new scanner object to read from System.in
        Scanner in = new Scanner(System.in);
        // This variable will be used to keep the total count.
        int count = 0;

        System.out.println("Welcome to the wordCount program.");
        System.out.println("Enter whatever you want on each line, " +
                           "and as many lines as you like!");
        System.out.println("Enter \"quit\" to exit the program and " +
                           "to see your total wordCount");

        // Check that the user has not entered the EOF character using hasNext.
        while (in.hasNext()) {

            // Read the line of input.
            String input = in.nextLine();
            // don't read more input after "quit"
            if (input.equals("quit")) {
                break;
            }
            // don't analyze blank lines
            if (input.equals("")) {
                continue;
            }    
            // update total count of number of words so far
            int numWords = countWords(input);
            count += numWords;

        }

        // Print out the total wordCount here.
        System.out.println("You entered " + count + " words");
        System.out.println("Goodbye");

    }
}