package ifelse;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		int number = 1;
		int num = 6;
		while (number < 5) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number");
			int a = sc.nextInt();
			if (a == num) {
				System.out.println("user ne guess kr liya");
				break;
			} else {
				System.out.println("user ne guess nhi kiya");
			}

		}
	}
}