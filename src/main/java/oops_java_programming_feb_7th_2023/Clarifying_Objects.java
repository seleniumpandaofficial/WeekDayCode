package oops_java_programming_feb_7th_2023;

public class Clarifying_Objects {

	// How do we create Objects ??
	// 1. new keyword
	// 2. newInstance() method
	// 3. clone() method
	// 4. deserialization
	// 5. factory methods

	String name;
	int age;
	double height;
	static String name1;

	public static void main(String[] args) {

		Clarifying_Objects co = new Clarifying_Objects();

		Clarifying_Objects co1 = new Clarifying_Objects();

		co.name = "Guss";

		Clarifying_Objects.name1 = "Jumbo";

		co.test1();
		co1.test1();

	}

	public void test1() {

	}

}
