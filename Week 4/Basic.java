/******************************************************************************/
/* This file was created by Jacob Zimmer for use at the International         */
/* University of East Africa in Kampala, Uganda.  It may be used as study     */
/* material for private individuals or with permission in an educational      */
/* setting.  Contact the creator at zimmer.jacob@gmail.com                    */
/******************************************************************************/
/* Name:                                                                      */
/* OOP1 Section:                                                              */
/******************************************************************************/
/* This is a diagnostic test designed to see how well you have learned the    */
/* concepts in the fourth week of OOP1.  THIS IS NOT FOR A GRADE, but it MUST */
/* be completed.  Try to complete each task to the best of your ability, but  */
/* if you cannot figure something out, please move on quickly.                */
/******************************************************************************/

public class Basic {
    public static void main(String[] args) {

        // The following line is called a "statement" and everything within the
        // brackets opened in the line above is called a "block".
        System.out.println("Welcome to your second program!");

        // Everything up to here should look familiar.  You may have noticed
        // the file names of these programs always match the first line of real
        // code, "public class Basic {", where this file is "Basic.java".  Be
        // sure to follow this rule to make the structure of your program clear
        // for others who might use it.

        // You should also notice that after certain lines there are brackets,
        // and that if a bracket is opened, it is always closed.  Your code will
        // not run if this is not true.  You can experiment with which pieces of
        // code are necessary for this program to run, but you will find that 
        // almost everything here is required.

        System.out.print("This is a place for experimentation, ");
        System.out.println("and you should take advantage of that!");
        System.out.println("See what you can break and then fix.");

        // Finally, every line (almost) in Java ends in either a bracket or a
        // semicolon so your code should follow this rule too.  Brackets are for
        // opening and closing blocks of code.  Semicolons are for ending 
        // statements.




        final boolean THE_TRUTH = true;

        if (THE_TRUTH) {
        	System.out.println("The Truth is true.");
        } else {
        	System.out.println("The Truth is false.");
        }





        final int condition = 2;

        if (condition == 1) {
        	System.out.println("Condition is 1");
        } else if (condition == 2) {
        	System.out.println("Condition is 2.");
        } else if (condition == 3) {
        	System.out.println("Condition is 3.");
        }



        switch (condition) {
        	case 1:		System.out.println("Condition is 1.");
        				break;
        	case 2: 	System.out.println("Condition is 2.");
        				break;
        	case 3:		System.out.println("Condition is 2.");
        				break;
        	default:	System.out.println("Condition is invalid.");
        				break;
        }
        



        // *** EXERCISES ***

    }
}