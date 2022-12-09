package main;

import java.util.Scanner;

public class Main {
	
	static Scanner scn = new Scanner(System.in);
	static int bakiye = 800;
	static int a;
	
	public static void main(String[] args) {
		atm();	
	}
	
	public static void atm() {
		
		menu();
		while(true) {
			secim();
			if(a == 1) {
				System.out.println("Bakiyeniz " + bakiye);
				bekle();
			}
			else if(a == 2) {
				paraCek();
				bekle();
			}
			else if(a == 3) {
				paraYatir();
				bekle();
			}
			
			else if(a == 4){
				break;
			}
			
			else {
				System.out.println("Sadece Menuden Bir Nuamra Seçiniz...");
			}
		}
	}
	
	public static void menu() {
		System.out.println("****************************");
		System.out.println("1. Bakiye: ");
		System.out.println("2. Para çek: ");
		System.out.println("3. Para yatır: ");
		System.out.println("4. Çıkış: ");
		System.out.println("****************************");
	}
	
	public static void secim() {
		System.out.print("Bir sayı giriniz: ");
		a = scn.nextInt();
	}
	
	public static void paraCek() {
		System.out.print("Çekmek istediğiniz tutar: ");
		int tutar = scn.nextInt();
		
		if(tutar > bakiye) {
			System.err.println("Bakiyeniz yetersiz Mevcut bakineyiz: " + bakiye);
		}
		else {
			bakiye = bakiye - tutar;
			System.out.println("Yeni Bakiyeniz: " + bakiye);
		}
	}
	
	public static void paraYatir() {
		System.out.print("Yatırmak istediğiniz tutar: ");
		int tutar = scn.nextInt();
		bakiye += tutar;
		System.out.println("Yeni Bakiyeniz: " + bakiye);
		
	}
	
	public static void bekle() {
		System.out.println("****************************");
		System.out.println("Menu için 0'a basınız: ");
		int check = scn.nextInt();
		if(check == 0) {
			menu();
		}
		
	}
}
