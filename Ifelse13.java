package ifelse;

import java.util.Scanner;

public class Ifelse13 {

	public static void main(String[] args) {
		// Taking user input
		Scanner number = new Scanner(System.in);
		System.out.println("enter number");
		// In age variable store user input value
		int age = number.nextInt();
		// checking user age is greater then 5b or not
		if (age >= 5) {
			System.out.println("School ja skte hai");
			// checking user age is greater then 18 or not
		}
		if (age >= 18) {
			System.out.println("Vote de skte hai");
			// checking user age is greater then 21 or not
		}
		if (age >= 21) {
			System.out.println("car drive kar skte hai");
			// checking user age is greater then 24 or not
		}
		if (age >= 24) {
			System.out.println("Shadi kar skte hai");

		}
	}
}