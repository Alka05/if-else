package ifelse;

import java.util.Scanner;

public class Ifelse3 {

	public static void main(String[] args) {
		// takeing user input
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr a number");
		// In number variable I store user input value
		int number = sc.nextInt();
		// checking number equals to varx or not
		int varx = 300 - 123;
		if (number == varx) {
			System.out.println("brabr hai");
		} else {
			System.out.println("brabr nhi hai");

		}

	}

}
