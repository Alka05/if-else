package ifelse;

import java.util.Scanner;

public class Ifelse8 {

	public static void main(String[] args) {
		// taking user input
		Scanner number=  new Scanner(System.in);
		System.out.println("enter water quantity");
		// In water variable store user input value 
		int water = number.nextInt();
		//checking in water filter water is greater then 1ltr. or not 
		if (water > 1) {
			System.out.println("paani bharo");
		//checking in water filter water is greater then 10ltr. or not 
		}else if (water > 10) {
		   System.out.println("nahi bharna");
	   } else {
		   System.out.println("over flow");
		   }
	   }
				
			
		}
		

	


