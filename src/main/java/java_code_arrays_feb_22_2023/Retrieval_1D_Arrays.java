package java_code_arrays_feb_22_2023;

public class Retrieval_1D_Arrays {

	public static void main(String[] args) {
    
		 int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		 
		 String[] S = {"java", "selenium", "python", ".Net", "c", "C++", "Cobol", "Cypress", "Javascript"};
		 
		 
		 for(int i=0 ; i<a.length ; i++) {
			 System.out.print(a[i]+ " ");
		 }
		 
		 System.out.println();
		 
		 System.out.println("The element at the 10th position is : " + a[9]);
		 
		 
		 for(int j=0 ; j<S.length ; j++) {
			 System.out.print(S[j]+ " ");
		 }
		 
		 System.out.println();
		 

	}

}
