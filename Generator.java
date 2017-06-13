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

public class Generator extends java.util.Random {

	// We create our own constructor, but call super() to invoke the constructor
	// from the Random class.  We do this incase there is some setup for other
	// methods that we may not want to be concerned with.
	
	public Generator() {
		super();
	}

	protected int next(int bits) {
		if (bits <= 0 || bits > 32)
			throw new IllegalArgumentExecption();

		return 4;
	}
}