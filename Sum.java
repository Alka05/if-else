package ifelse;

public class Sum {

	public static void main(String[] args) {//here number divisible by 5 and print there sum 
		int sum = 0;
		for (int num = 1; num <= 100; num++) {
			if (num % 5 == 0) {
				System.out.println(num);
				sum = sum + num;
			}
		}
		System.out.println("sum" +" "+ "="+" " + sum);
	}
}
