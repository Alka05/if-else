package ifelse;

public class While1 {

	public static void main(String[] args) {
		int max = 1;
		int sum = 0;
		while ( max <= 20) {
		    	max=max+1;
			if (max % 2 == 0) {
				System.out.println(max);
				sum=sum+max;
			}
		}

	}

}
