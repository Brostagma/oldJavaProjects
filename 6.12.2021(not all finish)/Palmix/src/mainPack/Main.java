package mainPack;

import loginPack.Login;

public class Main {

	public static void main(String[] args) {
		System.out.println("Running");
		try {
			new Login().goLaunch();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
