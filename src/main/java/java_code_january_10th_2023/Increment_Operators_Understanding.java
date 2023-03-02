package java_code_january_10th_2023;

public class Increment_Operators_Understanding {

	public static void main(String[] args) {
		//increment operators ?? ++  +1
		//pre-increment
		//post-increment
		
		//decrement operators ?? -- -1
		//pre-decrement
		//post-decrement
		
		
		int i = 1;
		i++;           //post increment operator
        ++i;             //pre increment operator
        i--;                //this is post decrement operator
        --i;                //this is pre decrement operator
        
        int a = 5; //latest value of a is 5
        int b = a++; //b finds a so it assigns itself value of a which is 5....
                     // ++ operator is attached to the body of a. so a has to increment itself by 1
        //latest value of b is 5
        //latest value of a will be 6
        System.out.println(a); 
        System.out.println(b); 
	}

}
