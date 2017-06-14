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

public class Control {
	public static void main(String[] args) {
		// So far, the programs we have looked at only execute each line once
		// and in a specific, sequential order.  Sometimes we need other orders
		// of execution to complete a task.

		// In most programs you will write, you will use some kind of conditional
		// logic.  This includes the if-else statement or just if statement.
		int x = 0;
		int y = 1;
		boolean isTrue = true;

		if (x < y) {
			System.out.println("0 < 1");
		} else {
			System.out.println("1 <= 0");
		}

		if (isTrue) {
			System.out.println("True is True");
		} else {
			System.out.println("True is False");
		}

		// In Java, the logical operators are && (and), || (or), and ! (not).


		// Java supports three types of loops: for, while, do-while

		// The for loop is useful when you know exactly how many times you 
		// will iterate through something.  The loop can either use an existing
		// variable or create its own.  If it makes its own variable then that
		// variable will only exist inside the loop.

		// Example with existing variable:
		int i = 0;
		for (i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println(i);

		// Example without existing variable:
		for (int j = 0; j <= 10; j++) {
			System.out.println(j);
		}
		//System.out.println(j); // Produces an error


		// The while loop is useful for execution conditional on something that
		// many change while the loop executes.  You'll notice that the examples
		// are the same as those for for loops.
		int k = 0;
		while (k <= 10) {
			System.out.println(k);
			k++;
		}


		// The do-while loop lets you execute the body once before checking a
		// condition and is useful in certain circumstances
		int l = 0;
		do {
			System.out.println(l);
			l++;
		} while (l <= 10);


		// *** EXERCISES ***

		// Create a for loop to count from 1 to 20.




		// Modify that loop to only print odd numbers using conditional logic.




		// Modify that same loop to only print even numbers by changing the 
		// increment value.




		// Use a while loop to count from 20 to 1.




		// Modify that loop to print only every third number (20, 17, 14, ...)




		// In the following loop, write code to print the sum of m and n 
		// only if they are equal, otherwise it should print nothing.
		for (int m = 0; m < 10; m++) {
			for (int n = 0; n < 10; n++) {

				// *** YOUR CODE HERE ***

			}
		}
	}
}
