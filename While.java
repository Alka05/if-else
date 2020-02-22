package ifelse;

public class While {

	public static void main(String[] args) {
		//In sum or max variable store value 
		int sum = 0;
		int max = 1;
		// print here 1 to 20 numbers 
		while (max <= 20) {
			System.out.println(max);
			//here increment in max
			max = max + 1;
			//here increment in sum
			sum = sum + max;
		}

	}

}
