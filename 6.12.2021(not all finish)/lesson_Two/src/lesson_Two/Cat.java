package lesson_Two;

public class Cat extends Animal{

	String color;
	public Cat(String name, int age, String color) {
		
		super(name, age);
		this.color = color;
	}
	
	@Override
	public int multiply(int weight, int height) {
		
		int result = super.multiply(weight, height);
		return result / 2;
	}

	@Override
	public void talk() {
		
		System.out.println("Meow! my age is: " + age);
	}
}
