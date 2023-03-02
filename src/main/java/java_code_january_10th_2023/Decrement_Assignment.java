package java_code_january_10th_2023;

public class Decrement_Assignment {

	public static void main(String[] args) {
	int i = 5; //latest value of i is 5
	int j = --i; //i=4  and  j= 4
	System.out.println("the value of j at row 7 is: " + j);
	System.out.println("the value of i at row 7 is: " + i);
	
	int k = j-- - j--;
	   //k= 4   - 3  = 1 
	   //j = 3, 2 - so j's latest value is 2
	// i is 4
	System.out.println("the value of j at row 11 is: " + j); //2
	System.out.println("the value of k at row 11 is: " + k); //1
	
	//latest value of i = 4
	//latest value of j = 2
	//latest value of k = 1
	int l = --i - i-- + i-- - j--;
	  //l =   3 - 3   + 2   - 2 = 0
	  //i =   3,,,,2,,,,1       = 1
	  //j = 1
	
	System.out.println(i); //1
	System.out.println(j); //1
	System.out.println(k); //1
	System.out.println(l); //0

	}

}
