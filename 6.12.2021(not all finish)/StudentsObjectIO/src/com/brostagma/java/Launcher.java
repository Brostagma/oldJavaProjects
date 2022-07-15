package com.brostagma.java;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filePath = "resources/student.zip";
		Student student1 = new Student("Sezer", 3, "IT-Computer");
		WriteObject.writeObject(student1, filePath);
	}
	

}
