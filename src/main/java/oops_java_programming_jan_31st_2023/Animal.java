package oops_java_programming_jan_31st_2023;

public class Animal {

	public static void main(String[] args) {
		System.out.println("I am coding");
		secret();
		Animal.secret();
		
		jail();
		Animal.jail();
		
		Animal animal = new Animal();  //create object like this
		animal.loginTest();
		animal.displayScreen();
		
	}

	private static void secret() {
		System.out.println("I have written some secret code here in this method");
	}

	protected static void jail() {
		System.out.println("I have written some protected code here in this method");
	}

	void loginTest() {
		System.out.println("I have written some default code here in this method");
	}
	
	public void displayScreen() {
		System.out.println("Samsung 4k Display");
	}

}
