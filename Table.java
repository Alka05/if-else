package ifelse;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// to take user input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		// taking num variable beacuse storing user variable
		int num = sc.nextInt();
		int table = 1;// table staring with one because stating with one.
		for (int number = 1; number <= 10; number++) {
			table = num * number;// here taking table, num and number because print whole table
			System.out.println(num + "*" + number + "=" + table); // format for table print

			{

			}

		}
	}
}
