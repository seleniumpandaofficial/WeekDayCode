package pattern_programming_in_java;

public class Pattern2 {

	public static void main(String[] args) {
		//outer for loop will be for number of rows represented by i
		
		for(int i=1 ; i<=5 ; i++) {
			
			for(int j=1; j<=i ; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}
