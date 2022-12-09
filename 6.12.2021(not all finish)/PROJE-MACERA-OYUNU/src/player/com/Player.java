package player.com;

import java.util.Scanner;

public class Player {

	private int damage,healthy,money,defaultHealthy;
	private String name,characterName;
	private Inventory inventory;
	Scanner scn = new Scanner(System.in);
	
	public Player(String name) {
		this.name = name;
		this.inventory = new Inventory();
		selectCharacter();
	}
	
	public void selectCharacter() {
		switch(characterMenu()) {
		case 1:
			initPlayer("Samuray",5,21,15);
			break;
		case 2:
			initPlayer("Okçu",7,18,20);
			break;
		case 3:
			initPlayer("Şovalye",8,24,5);
			break;
		default:
			initPlayer("Samuray",5,21,15);
			break;
			
		}
		System.out.println("------------------------------");
		System.out.println("Karakter: " + getCharacterName() + "\t Hasar: " + getDamage() + "\t Sağlık: " + getHealthy() + "\t Para: " + getMoney());
	}
	
	private void initPlayer(String characterName, int damage, int healthy, int money) {
		setCharacterName(characterName);
		setDamage(damage);
		setHealthy(healthy);
		setMoney(money);
		setDefaultHealthy(healthy);
	}

	private int characterMenu() {
		// TODO Auto-generated method stub
		System.out.println("Lütfen bir karakter seçiniz: ");
		System.out.println("1 - Samuray: \n \t Hasar : 5 \t Sağlık : 21 \t Para : 15 \n" );
		System.out.println("2 - Okçu: \n \t Hasar : 7 \t Sağlık : 18 \t Para : 20 \n");
		System.out.println("3 - Şovalye: \n \t Hasar : 8 \t Sağlık : 24 \t Para : 5 \n");
		System.out.print("Seçiminiz: ");
		int characterID = scn.nextInt();
		
		while(characterID < 1 || characterID > 3) {
			System.err.println("\n Lütfen geçerli bir karakter seçiniz.");
			System.out.println("1 - Samuray: \n \t Hasar : 5 \t Sağlık : 21 \t Para : 15 \n" );
			System.out.println("2 - Okçu: \n \t Hasar : 7 \t Sağlık : 18 \t Para : 20 \n");
			System.out.println("3 - Şovalye: \n \t Hasar : 8 \t Sağlık : 24 \t Para : 5 \n");
			System.out.print("Seçiminiz: ");
			characterID = scn.nextInt();
		}
		return characterID;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealthy() {
		return healthy;
	}

	public void setHealthy(int healthy) {
		this.healthy = healthy;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String character) {
		this.characterName = character;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	public int getDefaultHealthy() {
		return defaultHealthy;
	}

	public void setDefaultHealthy(int defaultHealthy) {
		this.defaultHealthy = defaultHealthy;
	}

}
