package ifelse;

import java.util.Scanner;

public class Ifelse11 {

	public static void main(String[] args) {
		// Taking user input
		Scanner number = new Scanner(System.in);
		System.out.println("enter number1>");
		System.out.println("enter number2>");
		// In num1 and num2 variable store user input value
		int num1 = number.nextInt();
		int num2 = number.nextInt();
		// checking num1 is greater or equal than num2
		if (num1 >= num2) {
			System.out.println("num1");
			// checking num2 is greater or equal to num1
		} else if (num2 >= num1) {
			System.out.println("num2");
		} else {
			System.out.println("no largest number");
		}

	}

}
