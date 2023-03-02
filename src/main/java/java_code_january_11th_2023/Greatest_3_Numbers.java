package java_code_january_11th_2023;

public class Greatest_3_Numbers {
	
	//WAP to print greatest of three numbers
	//     >   <  ==  <=  >=   != 
	//   && this is logical AND

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 10;
		  
		if(a>b && a>c) {
	//      f      f    = false
			System.out.println("a is the greatest: " + a);
		}else if(b>a && b>c) {
		//        f      f =  false
			System.out.println("b is the greatest: " + b);
		}else if (c>a && c>b){
			//     f  f  = false
			System.out.println("c is the greatest: " + c);
		}else {
			System.out.println("None of them is greatest");
		}
	
		
		

	}

}
