package ifelse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ifelse2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// using for user input
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		// print user input
		System.out.println("Enter a number");
		// This number variable for user input
		int number = Integer.parseInt(br.readLine());
		// checking user input is less then 10
		if (number < 10) {
			System.out.println(" 10 se chota hai");
			// checking user input geater then 10 and less then 20
			if (number > 10 && number < 20) {
				System.out.println("20 se chota hai");
			} else {
				System.out.println("20 se chota hai");
			}
		}
	}

}
