package com.brostagma.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Launcher {
	
	protected static final String FILE_NAME = "resources/date_time.txt";
	
	public static void main(String[] args) {
		initDateTime(FILE_NAME);
		getFileText(FILE_NAME);
	}
	
	private static void initDateTime(String fileName) {
		
		try(BufferedWriter bfWriter = new BufferedWriter(new FileWriter(fileName,true))) {
			
			Date currentDate = new Date();
			String date = currentDate.toString();
			
			bfWriter.write("Current Date ---> " + date + "\n" + "Start Program...(Test)" + "\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void getFileText(String fileName) {
		
		try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(fileName)))) {
			while(scanner.hasNextLine()) {
				
				System.out.println(scanner.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
	
	
	
	
}
