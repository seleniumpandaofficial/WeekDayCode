package oops_java_programming_feb_1st_2023;

public class Addition {

	public int addThreeNumbers(int a, int b, int c) {
		int sum = a + b + c;
		return sum;

	}

	public static void main(String[] args) {

		Addition ad = new Addition();
		int result = ad.addThreeNumbers(5, 10, 30);
		System.out.println("The sum is : " + result);
		System.out.println("the square root of 9 is : " + Math.sqrt(9));

		// System.out.println(addTwoNumbers(5, 10));

	}

}
