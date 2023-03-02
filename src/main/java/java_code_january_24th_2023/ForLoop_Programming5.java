package java_code_january_24th_2023;

public class ForLoop_Programming5 {

	// Print 11 multiples of 2 in descending order starting from 20
	// 20, 18, 16, 14, 12, 10, 8, 6, 4, 2, 0

	// print 11 multiples of 2
	// 2, 4, 6, 8,........, 22

	public static void main(String[] args) {

		for (int i = 20; i >= 0; i = i - 2) {
			System.out.println(i);
		}
		
		System.out.println("***********************************************************");
		
		
		for(int i=1; i<=11; i++) {
			System.out.println(i*2);
		}

	}

}
