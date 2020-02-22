package ifelse;

public class Whileloop6 {

	public static void main(String[] args) {
		for (int number = 1; number <= 100; number++) {
			if ((number % 3 == 0) && (number % 7 == 0)) {
				System.out.println("Navgurukul");
			} else if (number % 3 == 0) {
				System.out.println("Nav");
			}

			else if (number % 7 == 0) {
				System.out.println("Gurukul");

			} else {
				System.out.println(number);
			}
		}
	}
}
