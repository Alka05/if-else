package ifelse;

import java.util.Scanner;

public class Whileloop7 {

	public static void main(String[] args) {
		int number = 1;
		int sum = 0;
		int average = 0;
		while (number <= 11) {//11 times user input lena hai and uska sum kr ke avrrage print krna hai
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number");
			int num = sc.nextInt();
			number = number + 1;
			sum = sum + num;

			}
		System.out.println("sum" +" "+ sum);
		average =  sum /11;
		System.out.println("avrrage" +" "+ average);
		
		}

	}


