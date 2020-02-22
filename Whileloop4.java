package ifelse;

public class Whileloop4 {

	public static void main(String[] args) {
		int number = 12;
		int sum = 0;
		while (number <= 421) {
			System.out.println(number);
			number += number;
			sum = sum + number;
			sum = sum + 1;
		}

	}

}
