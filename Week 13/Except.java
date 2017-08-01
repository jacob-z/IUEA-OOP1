/******************************************************************************/
/* This file was created by Jacob Zimmer for use at the International 		  */
/* University of East Africa in Kampala, Uganda.  It may be used as study     */
/* material for private individuals or with permission in an educational      */
/* setting.  Contact the creator at zimmer.jacob@gmail.com                    */
/******************************************************************************/
/* Name:                                                                      */
/* OOP1 Section:                                                              */
/******************************************************************************/
/* This is a diagnostic test designed to see how well you have learned the    */
/* concepts in the thirteenth week of OOP1.  THIS IS NOT FOR A GRADE, but it  */
/* MUST be completed.  Try to complete each task to the best of your ability, */
/* but if you cannot figure something out, please move on quickly.            */
/******************************************************************************/

// In programming there are three types of errors: compilation errors, runtime
// errors, and logic errors.  Exceptions deal with runtime errors.  It is 
// possible for the program to enter a dangerous state because of bad inputs
// and many programs will check for these bad inputs.  On encountering them,
// the programs will throw runtime errors (exceptions).

public class Except {

	public static void causeAnException(String hello) {
		System.out.println(hello.charAt(0));
	}

	public static void main(String[] args) {

		// By far, the most common exception you will encounter is the 
		// ArrayIndexOutOfBoundsException.  This occurs when you try to
		// access an array beyond the bounds of that array.  It is very easy
		// to accidentally create this exception, see below.

		int[] a = new int[10];
		for (int i = 0; i < 11; i++) {
			a[i] = i;
		}

		// To continue with execution, comment out the code above.


		// You can prevent these exceptions by carefully checking your code,
		// or using a try-catch block of code. When the exception is thrown in
		// the try block, it gets passed to the catch block to see if the error
		// matches what we are trying to catch.  If it does, the catch block
		// will execute some kind of error condition handling.  You can also
		// include a "finally" statement that will always execute, but it is not
		// required.

		try {

			// This code is said to be "protected"
			a[10] = 10;

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Error Thrown!");

		} finally {

			// This block is good for taking care of things that need to happen
			// before the code exits from an exception. Or handling other things
			// that may need to happen for the program to continue execution.

			a[9] = 10;

		}


		// There are many other types of exceptions that may be thrown, and 
		// there are even custom classes of exceptions you can write for your
		// code to throw more specific errors.


		// *** EXERCISES ***

		// Use a try-catch block of code to eliminate an error in this code. Try
		// to also fix the method above so that it no longer throws the 
		// exception. Do not change any code below here other than to add the 
		// try and catch block.

		causeAnException(null);

	}
}