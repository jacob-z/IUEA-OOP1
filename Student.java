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

// This week, exercises will be thrown in with the program and you will be 
// required to complete certain methods to make it run correctly.

import java.util.Random;

public class Student {

	// As a reminder, always be careful about the scope and type of variables
	// you use as instance variables.  Try to reason about why these declarations
	// were used and others were not.

	private final String name;		// The name of the student object
	private int age;		 		// The age of the student object
	private final int userID;		// A randomly assigned user ID number


	// Sometimes in a program, it is useful to have multiple constructors 
	// because it gives you some flexibility in declaring objects.  All the 
	// fields of an object may not be known at the time of creation, in which
	// case you will want to have a generic constructor option.

	// A constructor for a custom student.
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		Random generator = new Random();
		this.userID = generator.nextInt();
	}

	// A constructor for a student named Jacob
	public Student() {
		name = "Jacob Zimmer";
		age = 20;
		userID = 0;
	}	


	// This week we will look more closely at methods.  Recall that all 
	// methods must have a return type and should be declared either public
	// or private depending on the scope of the method.  Making the wrong
	// decision about public or private can lead to security issues or
	// problems with usability.

	// This method should only return true if two students are equal.  
	// Be careful about how you define equality.
	public boolean isEqual(Student otherStudent) {
		/*** CHANGE AND COMPLETE THIS METHOD ***/

		return true; // make sure to change this line.
	}

	// This method should increase the student's age, and be called 
	// "happyBirthday".  You can decide if there should be arguments or not
	// and if there should be a return value or not.
	/*** CHANGE AND COMPLETE THIS METHOD ***/
	public String happyBirthday() {
		return null;
	}

	// You should define a toString method to nicely print Student information.
	/*** YOUR CODE HERE ***/


	// A main method to test your code.
	public static void main(String[] args) {

		// In the following examples, use the custom constructor.

		// Declare yourself as a new student called "me"
		/*** CHANGE THE LINE BELOW ***/
		Student me = new Student();

		// Declare a friend as a new student called "friend"
		/*** CHANGE THE LINE BELOW ***/
		Student friend = new Student();

		// Code below this point is designed to test how well you have
		// implemented the requested features.  You do not need to do anything beyond
		// this point unless you are interested in checking your code.

		Student jacob1 = new Student();
		Student jacob2 = new Student();

		if (!jacob1.isEqual(jacob2) || !jacob2.isEqual(jacob1)) {
			System.out.println("Your solution is not correct!");
		}

		if ((me.isEqual(jacob1) || friend.isEqual(jacob1)) ||
			(me.isEqual(jacob2) || friend.isEqual(jacob2))) {
			System.out.println("Your solution is not correct!");
		}

		if (me.isEqual(friend)) {
			System.out.println("I'm sorry you don't have friends.");
		}

		System.out.println(jacob1);
		System.out.println(jacob2);
		System.out.println(me);
		System.out.println(friend);

		int age = jacob1.age;
		jacob1.happyBirthday();
		if (age == jacob1.age) {
			System.out.println("Your solution is not correct!");
		}
	}
}