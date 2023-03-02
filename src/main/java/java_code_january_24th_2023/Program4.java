package java_code_january_24th_2023;

public class Program4 {
	//20 multiples of 5 in descending order starting from 250
	//add sum of those multiples 

	public static void main(String[] args) {
		int value = 250;
		int sum = 0;
		int limit = 20;
		
		while (limit >=0 ) {
			sum = sum + value;
			System.out.println(value);
			value = value - 5;
			
			limit--;
			
			System.out.println("The sum is : " + sum);
		}
		
		System.out.println("The sum is : " + sum);

	}

}
