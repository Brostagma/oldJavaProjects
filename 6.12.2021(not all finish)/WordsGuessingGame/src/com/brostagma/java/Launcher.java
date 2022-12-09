package com.brostagma.java;

import java.io.File;
import java.util.Scanner;

public class Launcher {

	private static Words[][] words = new Words[4][4];
	private static Scanner scanner = new Scanner(System.in);
	private static File file = new File("save/save.zip");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		checkSave();
		while(checkGame()) {
			
			System.out.print("\nExit game : (q) or Game : (g)");
			String out = scanner.nextLine();
			
			if(out.equals("q") || out.equals("quit")) {
				System.out.print("Save this game ? (yes(y) or no(n))");
				String out1 = scanner.nextLine();
				
				if(out1.equals("y") || out1.equals("yes")) {
					SaveGame.saveGame(words);
					System.out.println("Saved! Good bye");
					break;
				}
				else if(out1.equals("n") || out1.equals("no")) {
					System.out.println("Not save: Good bye");
					break;
				}
			}
			else if(out.equals("g") || out.equals("game")) {
				gameRule();
			}
			
		}
	}
	
	public static void checkSave() {
		
		if(file.exists()) {
			System.out.print("Continue Game ? : (yes(y) or no(n)");
			String out = scanner.nextLine();
			
			if(out.equals("y") || out.equals("yes")) {
				words = SaveGame.getSave();
			}
			else if(out.equals("n") || out.equals("no")) {
				initWords();
			}
		}
		else {
			initWords();
		}
	}
	
	public static void initWords() {
		
		words[0][0] = new Words('E');
		words[0][1] = new Words('A');
		words[0][2] = new Words('B');
		words[0][3] = new Words('F');
		words[1][0] = new Words('G');
		words[1][1] = new Words('A');
		words[1][2] = new Words('D');
		words[1][3] = new Words('H');
		words[2][0] = new Words('F');
		words[2][1] = new Words('C');
		words[2][2] = new Words('D');
		words[2][3] = new Words('H');
		words[3][0] = new Words('E');
		words[3][1] = new Words('G');
		words[3][2] = new Words('B');
		words[3][3] = new Words('C');
		
		
	}
	
	public static void gameRule() {
		
		initGameUI();
		System.out.print("1. Prediction : (please enter two numder = (0 3) -->");
		int i1 = scanner.nextInt();
		int j1 = scanner.nextInt();
		words[i1][j1].setPrediction(true);
		initGameUI();
		System.out.print("2. Prediction : (please enter two numder = (3 3) -->");
		int i2 = scanner.nextInt();
		int j2 = scanner.nextInt();
		
		
		
		if(i1 != i2 || j1 != j2) {
			if(words[i1][j1].getWord() == words[i2][j2].getWord()) {
				words[i2][j2].setPrediction(true);
				initGameUI();
				System.out.println("\n ********** Good! ********** \n");
			}
			else {
				words[i1][j1].setPrediction(false);
				System.out.println("\n ********** Try Again... **********\n");
			}
		}
		else {
			words[i1][j1].setPrediction(false);
			System.out.println("\n ********** Don't Cheat **********\n");
		}
		
	}
	
	public static void initGameUI() {
		
		for(int i = 0; i < 4; i++) {
			System.out.println("----------------------");
			for(int j = 0; j < 4; j++) {
				
				if(words[i][j].isPrediction()) {
					System.out.print(" |" + words[i][j].getWord() + "| ");
				}
				else {
					System.out.print(" | | ");
				}
			}
			System.out.println("\n");
		}
		System.out.println("----------------------");
	}
	
	public static boolean checkGame() {
		for(int i = 0; i < 4; i++) {
			
			for(int j = 0; j < 4; j++) {
				if(!words[i][j].isPrediction()) {
					return true;
				}
			}
		}
		return false;
	}
}
