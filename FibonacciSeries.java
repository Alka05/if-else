package ifelse;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num = 1;
		int sec = 0;
		System.out.println(sec);
		for (int number=1; number <= 10; number++) {
			int sum = num + sec;
			System.out.println(sum);
			num = sec;
			sec = sum;

		}
	}

}