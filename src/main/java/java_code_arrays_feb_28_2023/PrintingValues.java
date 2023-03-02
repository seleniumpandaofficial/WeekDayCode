package java_code_arrays_feb_28_2023;

public class PrintingValues {

	public static void main(String[] args) {
		
		int[][] a = { { 10, 20, 30, 40 }, { 50, 60 }, { 70, 80, 90 } };
		
		System.out.println(a); //[[I@
		System.out.println(a[0]); //[I@
		System.out.println(a[0][0]);
		System.out.println(a[0][2]);
		System.out.println(a[2][2]);
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[2].length);
	  //	System.out.println(a[0][0].length);

	}

}
