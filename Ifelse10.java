package ifelse;

import java.util.Scanner;

public class Ifelse10 {

	public static void main(String[] args) {
		// Taking two times user input
		Scanner num = new Scanner(System.in);
		System.out.println("enter number");
		System.out.println("enter number");
		// In varx and vary variable store user input values
		int varx = num.nextInt();
		int vary = num.nextInt();
		// Checking here varx divisble to vary or not
		if (varx % vary == 0) {
			System.out.println("Divisble");
		} else {
			System.out.println("Divisble not");
		}

	}

}
