package ifelse;

public class Numbers {

	public static void main(String[] args) {
		int star = 1;
		while (star <= 4) {
			int stars = 1;
			while (stars <= star) {
				System.out.print(stars);
				stars++;
			}
			System.out.println();
			star++;
		}

	
	}

}
