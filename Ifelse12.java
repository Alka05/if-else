package ifelse;

import java.util.Scanner;

public class Ifelse12 {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("enter number");
		int num = number.nextInt();
		int max = 5;
		int Index = 15;
		if (num % max == 0) {
			System.out.println("divisible");
		} else if (num % Index == 0) {
			System.out.println("divisible");
		} else {
			System.out.println("divisible not");
		}

	}

}
