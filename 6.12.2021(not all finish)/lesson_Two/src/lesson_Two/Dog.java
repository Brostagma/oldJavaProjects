package lesson_Two;

public class Dog extends Animal{

	public Dog(String name, int age) {
		
		super(name, age);
		
	}

	@Override
	public void talk() {
		
		System.out.println("Woof! my age is: " + age);
	}

	
}
