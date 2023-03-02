package java_code_january_11th_2023;

public class LeapYear_OrNot {

	// WAP to prove which one is a leap year or not
	public static void main(String[] args) {
		int year1 = 1994;
		int year2 = 2000;

		if ((year2 % 400 == 0) || ((year2 % 4 == 0) && (year2 % 100 != 0))) {
			System.out.println("2000 is a leap year");
		} else {
			System.out.println("2000 is not a leap year");
		}

	}

}
