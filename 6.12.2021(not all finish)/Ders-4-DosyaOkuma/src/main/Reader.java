package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Reader extends FileReader {
	

	Scanner scn = new Scanner(System.in);
	@SuppressWarnings("resource")
	public Reader(File file) throws IOException {
		super(file);
		if(file.exists()) {
			FileReader reader = new FileReader(file);
			BufferedReader bfReader = new BufferedReader(reader);
			
			String readText;
			while((readText = bfReader.readLine()) != null) {
				System.out.println(readText);
				
			}
			bfReader.close();
		}
		else {
			file.createNewFile();
			FileWriter writer = new FileWriter(file);
			BufferedWriter bfWriter = new BufferedWriter(writer);
			bfWriter.write("Test1");
			bfWriter.write("Test2");
			bfWriter.close();
		}
		
	
	}

}
