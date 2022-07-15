package com.brostagma.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveGame {

	public static void saveGame(Words[][] words) {
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("save/save.zip"))) {
			System.out.println("Saving...");
			
			out.writeObject(words);
			out.close();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static Words[][] getSave() {
		
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("save/save.zip"))) {
			
			Words[][] words = (Words[][]) in.readObject();
			in.close();
			return words;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
}
