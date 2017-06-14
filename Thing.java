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
/* concepts in the seventh week of OOP1.  THIS IS NOT FOR A GRADE, but it MUST*/
/* be completed.  Try to complete each task to the best of your ability, but  */
/* if you cannot figure something out, please move on quickly.                */
/******************************************************************************/

// This program will look a little different from those you have seen before,
// so spending extra time to study this structure will be very rewarding.

// All the programs we have written in Java so far have been contained in 
// classes, but those classes have not been full classes.  In a full class,
// There are "instance variables" that help define "what a class is" and
// instance methods that help define "what a class does"

// Here I introduce a class called Thing, but by reading the code you should be
// able to come up with a more descriptive name for what this class is.

public class Thing {

	// instance variables always need comments to describe what they do.
	// You'll notice that even if the variable names are descriptive, comments
	// are still required.  Be very careful about choosing types for these vars.
	// The way it is done here only allows the owner of the building to change.

	private String owner;			// The owner of the Thing
	private final String address;	// The location of the Thing
	private final double height;	// The height of the Thing
	private final double sqm;		// The square meters inside the Thing


	// The code that follows is a constructor.  Think of a class, or all of
	// this code as a "blueprint" for what you are going to make.  The 
	// constructor describes how a Thing is built, and you will see exactly
	// how that works in the main method below.

	public Thing(String owner, String address, double height, double sqm) {
		this.owner = owner;
		this.address = address;
		this.height = height;
		this.sqm = sqm;
	}


	// Now we have the instance methods.  These methods generally fall into two
	// categories, "getter" and "setter".  The changeOwner method is a setter
	// method because it changes the value of owner.  The whereIsIt method is
	// a getter method because it just returns the address.

	// Notice that the changeOwner, a setter method, has no return value.

	public void changeOwner(String newOwner) {
		owner = newOwner;
	}

	// The getter method whereIsIt has no arguments.

	public String whereIsIt() {
		return address;
	}


	// Lastly, we have a special type of instance method.  The toString method
	// defines a way that your object will be printed if you call 
	// System.out.println( *Thing instance* ).  You will see how it works 
	// in the main.

	public String toString() {
		return  "Owner:\t\t"       + owner +   "\n" +
				"Location:\t"      + address + "\n" + 
				"Height (m):\t"    + height +  "\n" +
				"Square Meters:\t" + sqm +     "\n";
	}


	// At this point, you should have a pretty good idea of what a better name
	// for this class might be.  If you are unsure, look back at the instance
	// variables and how we define what can be done with class. (It's a building)

	// Finally, in order to be run all programs must have a main method.  You
	// can create a class A without a main method so long as a main appears in
	// another class B that uses your class A.

	public static void main(String[] args) {

		// Now that we have defined everything above and made our "blueprints",
		// we can construct our objects in the main. The declaration is very 
		// similar to normal declarations, except you must use the constructor
		// from above.  This means you need to give arguments to build a Thing.

		Thing empireState = new Thing("Empire State Realty Trust", 
									  "350 Fifth Avenue Manhattan, NY 10118",
									  443.2, 208879);

		// Now that we have built the thing, let's check that it built 
		// how we wanted it to.  The cool thing about the toString method we
		// wrote earlier is that it is called automatically when the object
		// is being printed.

		System.out.println(empireState);

		// Let's also check the other two methods we wrote.

		empireState.changeOwner("Jacob Zimmer");
		System.out.println(empireState.whereIsIt());
		System.out.println(empireState);

		// *** NO EXERCISES THIS WEEK ***
		// If you want to experiment, try writing and using other methods.
	}
}
