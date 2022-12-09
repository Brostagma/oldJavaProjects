package com.brostagma.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
	
	
	public static void writeObject(Student student, String filePath) {
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath,true))){
			
			out.writeObject(student);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
