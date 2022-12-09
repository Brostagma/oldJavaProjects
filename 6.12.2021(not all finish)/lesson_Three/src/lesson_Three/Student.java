package lesson_Three;

public abstract class Student {

	private String name;
	private int number;
	
	public Student(String name, int number) {
		
		this.name = name;
		this.number = number;
	}
	
	public void showName() {
		
		System.out.println("My name is: " + name);
	}
	
	public abstract void department();
	
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public int getNumber() {
		
		return number;
	}
	public void setNumber(int number) {
		
		this.number = number;
	}
}
