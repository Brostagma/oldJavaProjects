package lesson_Three;

public class MathStudents extends Student {

	public MathStudents(String name, int number) {
		
		super(name, number);
	}

	public void calculate() {
		
		System.out.println("Calculated...");
	}

	@Override
	public void department() {
		
		System.out.println("My department is math!");
	}
}
