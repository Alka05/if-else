package ifelse;

import java.util.Scanner;

public class Ifelse4 {

	public static void main(String[] args) {
		// taking userr input
		Scanner num = new Scanner(System.in);
		System.out.println("enter number");
		// store user input value in number variable
		int number = num.nextInt();
		// store value in max variable
		int max = 44 * 30;
		// checking here max less then number or equal
		if (max <= number) {
			System.out.println("bada hai ya brabr hai");
		} else {
			System.out.println("chota hai");

		}

	}

}
