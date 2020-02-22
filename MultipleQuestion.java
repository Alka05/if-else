package ifelse;

import java.util.Scanner;

public class MultipleQuestion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int sec = sc.nextInt();
		int multiple = 0;
		for (int number = 1; number <= num; number++) {
			multiple = multiple + sec;
		}
		System.out.println(multiple);

	}

}
