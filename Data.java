/******************************************************************************/
/* Name: 																	  */
/* OOP1 Section: 															  */
/******************************************************************************/
/* This is a diagnostic test designed to see how well you have learned the    */
/* concepts in the first weeks of OOP1.  THIS IS NOT FOR A GRADE, but it MUST */
/* be completed.  Try to complete each task to the best of your ability, but  */
/* if you cannot figure something out, please move on quickly. 				  */
/******************************************************************************/

public class Data {
	public static void main(String[] args) {

		// In Java, there are three types of data and 8 "primitives"

		// Logical Data
		boolean isNewToJava = true;

		// Character Data
		char firstInitial = 'J';

		// Arithmetic Data (Maximum values)
		byte   nonce         = 127;
		short  smallNumber   = 32767;
		int    normalNumber  = 2147483647;
		long   bigNumber     = (long)  9.223372036E18;
		float  hugeNumber    = (float) 3.402823470E38;
		double largestNumber = 1.797693134E308;

		// Usually we only use a single space in Java programs, but sometimes 
		// it is useful to add more spaces to make a set of variables easier
		// to read.

		// Using these basic, or primitive, data types, we can built more 
		// complex data types.  

		// One example is the string class, which is just a sequence of chars.
		// *** See that we use quotes for strings and apostrophes for chars.
		String hello = "Hello";

		// We can also change data types if it is required or convenient
		String lastInitialAsString = Character.toString('Z');
		double aNumberThatMayIncrease = (double) 1;

		// *** EXERCISES ***

		// Create two integers with informative names and values 7 and 10.



		// Divide 7/10 but use the variables you have created.  Store the result 
		// in an int called quotient.


		// Check the value of quotient.  Is this what you expected?  How can you
		// alter the problem to get the desired result? (Hint: Data Types)


		// Create a char equal to the letter "A".  Print the result.



		// Cast the char to an int in a new variable.  Print the result.



		// Was the result what you expected?  Where did the number come from?
	}
}












