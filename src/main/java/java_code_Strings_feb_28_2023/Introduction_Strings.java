package java_code_Strings_feb_28_2023;

public class Introduction_Strings {

	public static void main(String[] args) {
		//String is a non-primitive data type
		//String is a Class
		//String is called Array of Characters
		//String is immutable
		//Various of ways of Creating String Objects - String, StringBuilder, StringBuffer
		
		
		char[] arr = {'s', 'e', 'l', 'e', 'n', 'i', 'u', 'm'};
		
		String S1 = new String(arr);
		System.out.println(S1);
		
		String S2 = new String();  //here also object is created
		String S3 = "Python"; //here also object is created
		StringBuilder S4 = new StringBuilder(); //here also object is created
		StringBuffer S5 = new StringBuffer(); //here also object is created
		

	}

}
