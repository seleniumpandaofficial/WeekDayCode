package java_code_arrays_feb_28_2023;

public class Assignment {

	public static void main(String[] args) {
		String[][] S1 = new String[2][3];
		
		S1[0][0] = "Hello";
		S1[0][1] = "World";
		S1[0][2] = "Automation";
		
		S1[1][0] = "Hello1";
		S1[1][1] = "World1";
		S1[1][2] = "Automation1";
		
		for(int i=0; i<S1.length; i++) {
			for(int j=0 ; j<S1[i].length ; j++) {
				System.out.print(S1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("*******************************************************************");
		
		
		String[][] S2  = {{"seleniumpanda@gmail.com", "Selenium@123", "http://tutorialsninja.com/demo"},
				                    {"seleniumpanda@rediffmail.com", "Selenium@123", "https://rediff.com"}};
		
		for(int i=0; i<S2.length; i++) {
			for(int j=0 ; j<S2[i].length ; j++) {
				System.out.print(S2[i][j] + " | ");
			}
			System.out.println();
		}
		}
		
		

	}

