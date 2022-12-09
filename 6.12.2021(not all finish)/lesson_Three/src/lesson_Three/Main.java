package lesson_Three;

public class Main {

	public static void main(String[] args) {

		Student st1 = new HistoryStudents("Ali", 341);
		Student st2 = new MathStudents("Ayşe", 362);
		
		st1.showName();
		st2.showName();
		
		((HistoryStudents) st1).talk();
		((MathStudents) st2).calculate();
		
		st1.department();
		st2.department();
	}

}
