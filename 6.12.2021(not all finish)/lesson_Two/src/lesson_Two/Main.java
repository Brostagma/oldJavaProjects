package lesson_Two;

public class Main {

	public static void main(String[] args) {
		/*
		Cat cat = new Cat("Elizabeth", 3,"White");
		
		cat.walk();
		//cat.age = 3;
		cat.showAge();
		cat.talk();
		
		System.out.println();
		
		Dog dog = new Dog("Alex", 4);
		
		dog.walk();
		//dog.age = 4;
		dog.showAge();
		dog.talk();
		*/
		
		Cat cat1 = new Cat("Eliz", 3, "Yellow");
		Cat cat2 = new Cat("Annie", 5, "Black");
		Dog dog1 = new Dog("Jeff", 1);
		
		System.out.println("Result: " + cat1.multiply(4, 2));
		System.out.println("Result: " + cat2.multiply(6, 3));
		System.out.println("Result: " + dog1.multiply(5, 2));
	}
}
