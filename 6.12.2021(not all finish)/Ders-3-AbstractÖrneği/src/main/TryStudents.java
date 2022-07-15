package main;

public class TryStudents {

	public static void main(String[] args) {
		
		Students student1 = new MathStudents("Ahmet", 341);
		Students student2 = new ScienceStudents("Berkay", 634);
		
		student1.sayName();
		student2.sayName();
		
		((MathStudents) student1).calculate();
		((ScienceStudents) student2).experiment();
	}
}
