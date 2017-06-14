/******************************************************************************/
/* This file was created by Thomas Gwozdz for use at the International        */
/* University of East Africa in Kampala, Uganda.  It may be used as study     */
/* material for private individuals or with permission in an educational      */
/* setting.  Contact the creator at tg0640@gmail.com                          */
/******************************************************************************/
/* Name:                                                                      */
/* OOP1 Section:                                                              */
/******************************************************************************/
/* This is a diagnostic test designed to see how well you have learned the    */
/* concepts in the 10th and 11th weeks of OOP1.  THIS IS NOT FOR A GRADE, but */
/* it MUST be completed.  Try to complete each task to the best of your       */
/* ability but if you cannot figure something out, please move on quickly.    */
/******************************************************************************/

// Import declarations are key to using packages. Import declarations allow
// your program to use methods and classes from other packages. This can save
// you time so you don't have to rewrite helpful methods that already exist!

// You can import a whole package or only specific classes from that package.
// Below, we have imported the class Random from the package java.util. We can
// now refer and call methods inside Random without reference Random. Java will
// automatically search java.util.Random to look for a method if you call one.
// We will also import other packages for use later.
import java.util.Random;
import java.lang.System;
import java.util.Date;
import java.util.ArrayList;

/*** YOUR IMPORTS HERE ***/ // see below for details


public class Package {
    public static void main(String[] args) {

        // The System package is automatically included in every program.
        // We included it here to show that System.out.println is from a 
        // package too! The java.lang.System package, to be exact.
        // We put \n at the end of the line because we want to print two
        // new lines after each section, to make the output more clear.
        // System.out.println already adds one newline, we added another.
        System.out.println("Welcome to packages!\n");

        // In Java, packages are a mechanism to encapsulate a group of classes, 
        // interfaces and sub packages. Java comes with many packages, including
        // util, lang, and io (which stands for input/output). We will
        // demonstrate how to utilize packages. We will not delve into how to
        // make your own packages yet - that is a little too complex for OOP I.

        // You may have to consult the internet to find various helpful methods
        // and research packages that you can use (and maybe download first).
        Random generator = new Random();
        System.out.println("A few randomly generated numbers using our Random package:");
        for (int i = 0; i < 3; i++) {
            int rand = generator.nextInt();
            System.out.println(rand);
        }
        System.out.println("");


        // We can use java.lang.System to time things. We will find the current time
        // before and after executing a portion of the program to find how long
        // that execution takes.
        long timestart = System.currentTimeMillis(); // the time at the beginning of execution
        int count = 0;
        for (int i = 0; i < 1000000; i++) {
            count *= i;
        }
        long timeend = System.currentTimeMillis();   // the time after execution

        // Printing the difference in times
        System.out.println("Multiplying 1 million numbers took only " 
            + (timeend - timestart) + " milliseconds.\n");


        // Using the java.util.Date package, we can find the current date
        Date date = new Date();
        System.out.println("The date and time is " + date.toString() + "\n");


        // Using a ArrayList package, we can represented an ordered list of objects.
        // An ArrayList is a list simply stored in an array object behind the scenes,
        // which allows for many constant time functions, making the object run fast.
        // In this example, we will input names in a class, then print out the names.
        ArrayList<String> classlist = new ArrayList<String>();
        classlist.add("Thomas");
        classlist.add("Jacob");
        classlist.add("Edison");
        classlist.add("Irene");
        classlist.add("Florence");
        System.out.println("Our example class has " 
            + classlist.size() + " people. Their names are:");

        // Using a for-each loop, we can iterate through the ArrayList called list to
        // print out the name of everyone in the class. The for-each loop can only be used
        // on objects that implement an Iterator (ArrayList does). This makes the
        // printing of all the names very simple and clean.
        for (String name : classlist) {
            System.out.println(name);
        }
        System.out.println("");

        
        System.out.println("This is the output of your code from the exercises:");

        /*** EXERCISES ***/

        // Use the Date package to print the time in milliseconds since Jan 1, 1970.
        // HINT: Find documentation online about Date and search for a method that will
        // return this. Online, search for "java util Date".

        /*** YOUR CODE HERE ***/

        // In Java, String is a class in the package java.lang. (That is why the type
        // String is capitalized, while int or float are not. They are primitive types.)
        // Use String to print the string "   There is lots of whitespace around    ".
        // (Do not just print the statement! Use a method from the String class.)

        /*** YOUR CODE HERE ***/

        // Use a package to return 30^6.
        // HINT: Search online for java packages built for math, then search in that 
        // class for a method that does powers.

        /*** YOUR CODE HERE ***/
    }
}