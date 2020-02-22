package ifelse;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();// user input store in num variable
		int factor = 0;//taking factor variable because for checking how many factors in between 2 to that user number.

		for (int number = 2; number < num; number++) {//this lop is working for 2 to user number 
			if (num % number == 0) {//here checking that number divisible by user number or not
				factor = factor + 1;//increment factor one by one 
			}
		}

		if (factor == 0) {//checking factor == 0 or not 
			System.out.println("prime");
		} else {
			System.out.println("not prime");

		}
	}

}
