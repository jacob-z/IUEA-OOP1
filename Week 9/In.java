
import java.util.Scanner;

public class In {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);


		System.out.print("Please enter an int: ");
		int ival = in.nextInt();


		System.out.print("Please enter a double: ");
		double dval = in.nextDouble();
		in.nextLine();


		System.out.print("Please enter a line of text: ");
		String sval = in.nextLine();


		System.out.printf("You have entered %d, %.2f, and %s%n", ival, dval, sval);


		if (in.hasNext()) {
			System.out.println("true");

		} else {
			System.out.println("false");
		}
	}
}