package oops_java_programming_feb_1st_2023;

public class ClassAssignment {

	public int addition(int a, int b) {
		int sum = a + b;
		return sum;

	}

	public int subtraction(int a, int b) {
		int sub = a - b;
		return sub;

	}

	public int mutiplication(int a, int b) {
		int mult = a * b;
		return mult;

	}

	public int division(int a, int b) {
		int div = a / b;
		return div;

	}

	public static void main(String[] args) {
		ClassAssignment hani = new ClassAssignment();

		int sumresult = hani.addition(20, 30);
		System.out.println("the sum is : " + sumresult);

		int subresult = hani.subtraction(20, 30);
		System.out.println("the sub is : " + subresult);

		int multresult = hani.mutiplication(20, 30);
		System.out.println("the multi is : " + multresult);

		int divresult = hani.division(20, 30);
		System.out.println("the div is : " + divresult);

	}

}
