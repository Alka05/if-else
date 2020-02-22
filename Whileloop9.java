package ifelse;

public class Whileloop9 {

	public static void main(String[] args) {
		//print here odd and even number like ( +1,-2,+3....-100)
		for (int number = 1; number <= 100; number++) {
			if (number % 2 == 0) {
				System.out.println("-" + number);

			} else {
				System.out.println("+" + number);
			}
		}

	}

}
