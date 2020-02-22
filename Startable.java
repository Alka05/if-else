package ifelse;

public class Startable {
	// 2 table print in star

	public static void main(String[] args) {
		for (int star = 1; star <= 10; star++) {
			for (int stars = 1; stars <= star; stars++) {
				System.out.print("*" + "*");
			}
			System.out.println();
		}

	}

}
