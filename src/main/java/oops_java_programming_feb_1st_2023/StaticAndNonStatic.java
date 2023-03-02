package oops_java_programming_feb_1st_2023;
//static can be used in certain entities

//Variable (Class level it can be used)

//Variable (local level it cannot be used. Will throw an error)
//with methods
//with blocks
//with inner class
//static cannot be used with outer class

//static belongs to the Class
//non-static belongs to the Object

//static entity will call static entity only. It will never call non-static entity

//Will non-static entity be able to call a static entity ?
//non static can call non static directly
//in every method or even variable

public class StaticAndNonStatic {

	String name = "John"; // an instance variable
	static int i = 25; // is a static variable.
	

	public static void display(int x, int y) {
		int i = 2; // local variable is neither static nor non-static
	}
	
	public static void hello() {
		System.out.println("This is static hello method");
		
		display(10, 20);
	}
	
	public void test() {
		System.out.println("Non static test method");
		hello();
	}
	
	
	public static void main(String[] args) {
		display(1,2);
		StaticAndNonStatic.display(4, 5);
		
		StaticAndNonStatic san = new StaticAndNonStatic();
		
		san.test();
		san.hello();
		
		StaticAndNonStatic san1 = new StaticAndNonStatic();
		
	}

}
