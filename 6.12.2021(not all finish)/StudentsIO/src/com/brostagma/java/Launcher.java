package com.brostagma.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Launcher {

	static final String READ_FILE_PATH = "resources/students.txt";
	static final String WRITE_FILE_PATH = "resources/studentsNotes.txt";
	public static String calculateNotes(String name, int exam1, int exam2, int finalExam) {
		
		String out = "";
		
		double notes = (exam1 * 3 / 10.0) + (exam2 * 3 / 10.0) + (finalExam * 4 / 10.0);
		
		if(notes >= 90) {
			out = name + " --> Student notes <AA>";
		}
		else if(notes >= 85) {
			out = name + " --> Student notes <BA>";
		}
		else if(notes >= 80) {
			out = name + " --> Student notes <BB>";
		}
		else if(notes >= 75) {
			out = name + " --> Student notes <CB>";
		}
		else if(notes >= 70) {
			out = name + " --> Student notes <CC>";
		}
		else if(notes >= 65) {
			out = name + " --> Student notes <DC>";
		}
		else if(notes >= 60) {
			out = name + " --> Student notes <DD>";
		}
		else if(notes >= 55) {
			out = name + " --> Student notes <FD>";
		}
		else {
			out = name + " --> Student notes <FF>";
		}
		return out;
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(READ_FILE_PATH)))) {
			BufferedWriter bfWriter = new BufferedWriter(new FileWriter(WRITE_FILE_PATH));
			
			while(scanner.hasNextLine()) {
				String studentInfo = scanner.nextLine();
				String[] studentsArray = studentInfo.split(",");
				int exam1 = Integer.valueOf(studentsArray[1]);
				int exam2 = Integer.valueOf(studentsArray[2]);
				int finalExam = Integer.valueOf(studentsArray[3]);
				
				String out = calculateNotes(studentsArray[0], exam1, exam2, finalExam);
				bfWriter.write(out + "\n");
			}
			bfWriter.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
