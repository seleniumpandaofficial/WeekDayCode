package java_code_january_17th_2023;

public class Program2 {
	//WAP to print first 20 multiples of 10 and add the multiples
	//10, 20, 30,......................,200
	//10+20+30+....................+200 = ?  (sum)

	public static void main(String[] args) {
		
		int i =1;
		int sum = 0;
		
		while(i<=20) {
			System.out.println(i*10); //10
			sum = sum+ (10*i);
			i++;
		}
	
System.out.println("The final summation will be : " + sum);
	}

}
