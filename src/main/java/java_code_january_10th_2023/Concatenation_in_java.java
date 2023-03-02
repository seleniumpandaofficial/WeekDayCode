package java_code_january_10th_2023;

public class Concatenation_in_java {

	public static void main(String[] args) {
		// concatenation is adding (NO - this wrong answer)
		// concatenation is joining. And we use + operator
        int i = 2;
		int j = 3;
		String S1 = "Hello";
		String S2 = "World";

		System.out.println(i + j);
		System.out.println("the value of i joining with j is:" + i + j);
		System.out.println(i + j + S1); // 5Hello
		System.out.println(i + j + S1 + S2); // 5HelloWorld
		System.out.println(S1 + S2 + i + j); // HelloWorld23
		// S1+S2+i+j
		// HelloWorld+2 = HelloWorld2 + 3 = HelloWorld23

		System.out.println(S1 + S2 + (i + j)); // HelloWorld5

		// Assigning spaces
		System.out.println(S1 + " " + S2);
		System.out.println(S1 + " " + S2 + " " + i + " " + j);
		String S10 = "My name is Khan";
		String S11 = "I am 33";
		System.out.println(S10 + " & " + S11);

	}

}
