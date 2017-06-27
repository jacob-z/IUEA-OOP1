/******************************************************************************
 * Author: Jacob Zimmer
 * wordCount is a program to count the number of words entered to stdin without
 * counting any whitespace characters.  IUEA students should try to see if it
 * is actually correct.
 *****************************************************************************/


import java.util.Scanner;

public class wordCount {
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

            // Exit if input is "quit".
            // We must use the .equals method to compare the content of strings.
            if (input.equals("quit")) {
                break;
            }

            // Don't include blank lines.
            // Also use the .equals method here.
            if (input.equals("")) {
                continue;
            }

            // Count the words in this line.
            // We saw that split used to take an argument of a single space,
            // like " ", but now it has "\\s+".  This is called a regular 
            // expression and we use it to match patterns.  This particular
            // pattern matches at least one of any whitespace character, and
            // removes it from the string.
            int numWords = input.trim().split("\\s+").length;

            // There is another more complicated method that we began to 
            // discuss in class using arrays.  Any student looking for a 
            // challenge may attempt the following:

            // boolean inWord = false;
            // char[] contents = input.toCharArray();
            // for (int i = 0; i < contents.length; i++) {

            //  if (Character.isWhitespace(contents[i]) && inWord) {

            //      // YOUR CODE HERE

            //  } else if (!Character.isWhitespace(contents[i])) {

            //      // YOUR CODE HERE

            //  }
            // }

            // Accummulate the wordCount
            count += numWords;

        }

        // Print out the total wordCount here.
        System.out.println("You entered " + count + " words");
        System.out.println("Goodbye");

    }
}