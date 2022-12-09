package main;

import java.io.File;
import java.io.IOException;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		try {
			new Reader(new File("./bin/main/text"));
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}
