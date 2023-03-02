package java_code_january_24th_2023;

public class ForLoop_Program4 {
	
	//use for loop to print first 20 multiples of 5 and add the multiples

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=1 ; i<=20 ; i++) {
			System.out.println(i*5);
			sum = sum + (i*5);
			System.out.println("the sum at each iteration is : " + sum);
		}
		
		System.out.println("the sum is : " + sum);
	

	}

}
