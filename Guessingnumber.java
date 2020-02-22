package ifelse;

import java.util.Scanner;

public class Guessingnumber {

	public static void main(String[] args) {
		int number = 1;
		int num = 5;
		while (number <= 10) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number");
			int a = sc.nextInt();
			if (a < num) {
				System.out.println("number se chota hai");
			} else if (a > num) {
				System.out.println("number bada hai");
			} else if (a == num) {
				System.out.println("number guess kr liya");
			}
			number = number + 1;
		}
	}

}
