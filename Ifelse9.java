package ifelse;

import java.util.Scanner;

public class Ifelse9 {

	public static void main(String[] args) {
		// Taking user input
		Scanner num = new Scanner(System.in);
		System.out.println("enter number");
		// In number variable store user input value
		int number = num.nextInt();
		// checking number is divible 2 or not
		if (number % 2 == 0) {
			System.out.println("divible");
		} else {
			System.out.println("divible not");
		}
	}

}
