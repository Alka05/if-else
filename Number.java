package ifelse;

public class Number {

	public static void main(String[] args) {//number serious print like 
		//1
		//22
		//333
		int star = 1;
		while (star <= 4) {
			int stars = 1;
			while (stars <= star) {
				System.out.print(star);
				stars++;
			}
			System.out.println();
			star++;
		}

	}

	}


