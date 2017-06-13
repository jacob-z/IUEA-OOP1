/******************************************************************************/
/* This file was created by Jacob Zimmer for use at the International 		  */
/* University of East Africa in Kampala, Uganda.  It may be used as study     */
/* material for private individuals or with permission in an educational      */
/* setting.  Contact the creator at zimmer.jacob@gmail.com 					  */
/******************************************************************************/
/* Name: 																	  */
/* OOP1 Section: 															  */
/******************************************************************************/
/* This is a diagnostic test designed to see how well you have learned the    */
/* concepts in the first weeks of OOP1.  THIS IS NOT FOR A GRADE, but it MUST */
/* be completed.  Try to complete each task to the best of your ability, but  */
/* if you cannot figure something out, please move on quickly. 				  */
/******************************************************************************/

// In classes which make use of inheritance, you are able to overwrite some of 
// the methods of the parent class.  In this example we will take the Java 
// Random library and break it so that it is no longer random.  Typically when 
// using inheritance, you must be careful not to break the functionality you
// are trying to inherit.  This example showcases the dangers.

// The Random class provides a method called "next" that returns a certain
// number of random bits.  If we overwrite this method incorrectly, it will
// break all the other random functions of the Random class that our class
// Generator is inheriting.

import java.util.Random;

public class Generator extends Random {

	// We create our own constructor, but call super() to invoke the constructor
	// from the Random class.  We do this incase there is some setup for other
	// methods that we may not want to be concerned with.
	
	public Generator() {
		super();
	}


	// This is the method we are going to overwrite.  We will pretend that we
	// wanted to ensure this was random so we rolled a die and got the number
	// 4.  Based on this, we want the method to return 4 because that was chosen 
	// randomly.  Obviously there are problems with this thinking, but for the
	// sake of learning to avoid these problems you must commit the error.

	protected int next(int bits) {
		// Don't worry about this assert statement, it is just here to make sure
		// the user inputs the correct number of bits.
		assert 0 < bits && bits <= 32;

		return 4;
	}

	public static void main(String[] args) {

		// Now to see the difference we will create instances of both
		// Generator and the parent class Random to see how our randomness
		// compares.  Also notice that a new Generator meets the requirements
		// of class Random but you could not declare a Generator to be a new
		// Random.

		Random random = new Random();
		Random generator = new Generator();

		// We are going to make the same call to the Random class method
		// nextInt(10), which gives a random integer less than 10.  The 
		// problem we will see is that nextInt, which we have not changed,
		// actually relies on next for its randomness.

		System.out.println("Printing random bytes (Random):");
		for (int i = 0; i < 10; i++) {
			System.out.print(random.nextInt(10) + " ");
		}

		System.out.println("\nPrinting \"random\" bytes (Generator):");
		for (int i = 0; i < 10; i++) {
			System.out.print(generator.nextInt(10) + " ");
		}

		System.out.println("");

		// *** NO EXERCISES THIS WEEK ***
		// If you wish to practice with inheritance you can try to override the
		// other methods of Random, or try to make your own random function
		// for a serious challenge.
	}
}