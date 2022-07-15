package com.brostagma.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static Student readObject(String filePath) {
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))){
            
			Student student1 = (Student)in.readObject();
            return student1;
            
        } catch (FileNotFoundException e) {
        	e.printStackTrace();
        }  catch (ClassNotFoundException e) {
        	e.printStackTrace();
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		String filePath = "resources/student.zip";
		
		Student student = ReadObject.readObject(filePath);
		System.out.println(student);
		
	}
	 
}
