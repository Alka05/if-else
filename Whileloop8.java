package ifelse;

public class Whileloop8 {

	public static void main(String[] args) {
		int sum = 0;
		for (int number = 30; number <= 420; number++) {
			if (number % 8 == 0) {
				System.out.println(number);
				sum = sum + number;
			}

		}
		System.out.println("sum" + " " + sum);

	}

}
