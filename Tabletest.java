package ifelse;

import java.util.Scanner;

public class Tabletest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int table = 1;
		for (int number = 1; number <= 10; number++) {
			table = num * number;
			System.out.println(num + "*" + number + "=" + table);
		}

	}

}
