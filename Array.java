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
/* concepts in the sixth week of OOP1.  THIS IS NOT FOR A GRADE, but it MUST  */
/* be completed.  Try to complete each task to the best of your ability, but  */
/* if you cannot figure something out, please move on quickly.                */
/******************************************************************************/

public class Array {
	public static void main(String[] args) {

		// We have already seen some uses of strings in Java, but you may not 
		// know that strings have an entire library of functions they can 
		// perform. Tools from the Java string library: 

		String example = "This is just an example of a string.";

		// We use the contains method to see if the substring is there.
		System.out.println(example.contains("This"));

		// We can call the length method to get the number of characters.
		System.out.println(example.length());

		// We can also find the first place a character appears in the string.
		System.out.println(example.indexOf('j'));

		// Use substring to extract part of a string
		System.out.println(example.substring(0, 9));

		// Use trim to remove extra whitespace from the ends of the string
		String needsTrimming = "   Here is a string with lots of whitespace.  ";
		System.out.println(needsTrimming.trim());


		// Arrays are one of the most powerful data types in any programming
		// language.  They are sequential spaces in memory used for storing 
		// closely related data.

		// Declare a new array of type int containing {2, 3, 4, 5, 6}
		int[] sample = new int[]{2, 3, 4, 5, 6};

		// It is important to remember that arrays are zero-indexed in Java
		// so sample[4] refers to the 5th element of the array.
		System.out.println(sample[4]);

		// We can also get the length of the array from its default length 
		// property.  Notice this is not a method and there are no "()"
		System.out.println(sample.length);

		// We can also declare an empty array, but we must specify a size.  This
		// array of strings can now hold any sentence of less than 10 words. But
		// each string could technically hold many sentences too.
		String[] sentence = new String[10];
		sentence[0] = "Hello";
		sentence[1] = "World";

		// In order to print the elements of an array, we must use a for loop.  
		// Notice what it prints out for unassigned elements of the array.
		for (int i = 0; i < sentence.length; i++) {
			System.out.println(sentence[i]);
		}


		// *** EXERCISES ***

		// Create an array of ints with 100 elements
		

		// Use a loop to fill that array with the numbers 1 to 100
		


		// Print that array out with 10 numbers per row, we will be impressed if
		// you can make the single digit numbers be right aligned with 
		// everything else.  See this example with 1-20:
		//  1  2  3  4  5  6  7  8  9 10
		// 11 12 13 14 15 16 17 18 19 20
		// You should NOT hard code 10 print statements!




		// fill a new int array with the squares of the numbers 1 - 20.
		// Do not hard code these, use a loop.



		// Go through the array and pull out with numbers are divisible by 2,
		// which are divisible by 3, and which are divisible by 5.  You should
		// print out three lists, one for each divisor.





	}
}
