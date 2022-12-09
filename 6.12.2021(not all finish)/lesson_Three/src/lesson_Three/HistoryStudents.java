package lesson_Three;

public class HistoryStudents extends Student {

	public HistoryStudents(String name, int number) {
		
		super(name, number);
	}

	public void talk() {
		
		System.out.println("Talking...");
	}

	@Override
	public void department() {
		
		System.out.println("My department is history!");
	}

}
