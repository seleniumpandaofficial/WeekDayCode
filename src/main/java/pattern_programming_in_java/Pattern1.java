package pattern_programming_in_java;

public class Pattern1 {
	
	//for 1 run of outer for loop, all the iterations of inner for loop will occur

	public static void main(String[] args) {
		
		for(int i=1 ; i<=5 ; i++) {       //outer for loop
			
			for(int j=1 ; j<=5 ; j++) {      //inner for loop
				System.out.print("$ ");
			}
			
			System.out.println();
		}

	}

}
