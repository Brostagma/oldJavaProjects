package main;

import java.util.Scanner;

public class Main {
	
	static Scanner scn;
	
	public static void main(String[] args) {
		/* KULLANICIDAN DEĞER ALABİLMEK VE HESAPLAMAK İÇİN
		 RAM ÜZERİNDE 4 FARKLI INT TİPİ DEĞİŞKEN AÇTIK */
		int birinciNot;
		int ikinciNot;
		int ucuncuNot;
		int ortalama;
		
		/* KULLANICININ DEĞER GİREBİLMESİ İÇİN JAVANIN HAZIR SINIFLARINDAN SCANNER'I 
		REFERANS İSMİ VEREREK TANIMLADIK */
		scn = new Scanner(System.in);
		
		/* KULLANICI İÇİN EKRANA BİLGİLENDİRME MESAJINI YAZDIK. VE DEĞER BEKLEDİK. */
		System.out.print("Birinci Notunuzu Girin: ");
		birinciNot = scn.nextInt();
		
		
		System.out.print("İkinci Notunuzu Girin: ");
		ikinciNot = scn.nextInt();
		
		System.out.print("Üçüncü Notunuzu Girin: ");
		ucuncuNot = scn.nextInt();
		
		ortalama = (birinciNot + ikinciNot + ucuncuNot) / 3;
		System.out.println("Ortalamanız: " + ortalama);
		
		if(ortalama >= 85) {
			//5
			System.out.println("5");
		}
		else if(ortalama < 85 && ortalama >= 65) {
			//4
			System.out.println("4");
		}
		
		else if(ortalama < 65 && ortalama >= 50) {
			//3
			System.out.println("3");
		}
		
		else if(ortalama < 50 && ortalama >= 35) {
			System.out.println("2");
		}
		
		else {
			System.out.println("1");
		}
		
	}
}
