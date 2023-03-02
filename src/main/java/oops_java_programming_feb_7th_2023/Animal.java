package oops_java_programming_feb_7th_2023;

public class Animal {

	// identity (name)
	// state (breed, color, age)
	// behavior (barking, sleeping, eating)

	static String name = "Marcus";
	String breed = "Labrador";
	int age = 5;
	String color = "Fawn";

	public static void main(String[] barry) {

		Animal dog = new Animal();
		System.out.println(dog.name);
		System.out.println(dog.age);
		System.out.println(dog.breed);

		dog.barking();
		dog.eating();
		// dog.sleeping();
		sleeping();
		
		Birds barry1 = new Birds();
		barry1.speaking();
		barry1.flying();
		barry1.nameBird = "Pet";

	}

	public void barking() {
		System.out.println("Marcus barks");
	}

	public void eating() {
		System.out.println("Marcus eats");
	}

	public static void sleeping() {
		System.out.println("Marcus sleeps");
	}

}

class Birds {
	
	String nameBird;
	
	public void flying() {
		System.out.println("Parrot flies");
	}
	
	public void speaking() {
		System.out.println("Parrot speaks");
	}
}
