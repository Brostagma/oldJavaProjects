package lesson_Two;

public class Animal {
	
	String name;
	int age;
	
	public Animal(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public int multiply(int weight, int height) {
		
		return (weight * height);
	}
	
	public void walk() {
		
		System.out.println("Walking...");
	}
	
	public void showAge() {
		
		System.out.println("Age " + age);
	}
	
	public void talk() {
		
		System.out.println("I am animal");
	}
}
