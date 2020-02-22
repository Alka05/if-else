package ifelse;

public class Numbertest12345 {

	public static void main(String[] args) {//number print 
		//12345
		//1234
		//123
		//12
		//1
		for (int number = 5; number >= 0; number--) {
			for (int num = 1; num <= number; num++) {
				System.out.print(num);
			}
			System.out.println();
		}
	}
}