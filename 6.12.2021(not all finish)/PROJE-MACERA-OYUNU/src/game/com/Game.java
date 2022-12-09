package game.com;

import player.com.Player;

import java.util.Scanner;

import location.com.Location;
import location.safelocation.com.SafeHouse;
import location.safelocation.com.ToolStore;

public class Game {
	Player player;
	Location location;
	String playerName;
	Scanner scn = new Scanner(System.in);
	
	public void login() {
		System.out.println("Macera Oyununa hoşgeldiniz!");
		System.out.print("Oyuna başlamadan önce isminizi giriniz: ");
		playerName = scn.nextLine(); 
		player = new Player(playerName);
		start();
	}
	
	private void start() {
		while(true) {
			System.out.println("------------------------------");
			System.out.println("Eylem gerçekleştirmek için bir yer seçiniz: ");
			System.out.println("1. Güvenli ev --> Size ait güvenli bir mekan, düşman yok!");
			System.out.println("2. Mağaza --> Silah ve Zırh alabilirsiniz!");
			System.out.println("3. Mağara --> Karşınıza belki zombi çıkabilir!");
			System.out.println("4. Orman --> Karşınıza belki vampir çıkabilir!");
			System.out.println("5. Nehir --> Karşınıza belki ayı çıkabilir!");
			System.out.print("Gitmek istediğiniz yer: ");
			int selectLocation = scn.nextInt();
			while(selectLocation < 1 || selectLocation > 5) {
				System.out.println("------------------");
				System.out.println("Eylem gerçekleştirmek için bir yer seçiniz: ");
				System.out.println("1. Güvenli ev --> Size ait güvenli bir mekan, düşman yok!");
				System.out.println("2. Mağaza --> Silah ve Zırh alabilirsiniz!");
				System.out.println("3. Mağara --> Karşınıza belki zombi çıkabilir!");
				System.out.println("4. Orman --> Karşınıza belki vampir çıkabilir!");
				System.out.println("5. Nehir --> Karşınıza belki ayı çıkabilir!");
				System.out.print("Gitmek istediğiniz yer: ");
				selectLocation = scn.nextInt();
			}
			
			switch(selectLocation) {
			case 1:
				location = new SafeHouse(player);
				break;
			case 2: 
				location = new ToolStore(player);
				break;
			default:
				location = new SafeHouse(player);
				break;
			}
			
			if(!location.getLocation()) {
				System.out.println("------------------------------");
				System.err.println("Oyun Bitti!");
				System.out.println("------------------------------");
				break;
			}
		}
	}
}





















































