package location.safelocation.com;

import player.com.Player;

public class ToolStore extends SafeLocation {

	public ToolStore(Player player) {
		super(player, "Mağaza");
	}
	
	public boolean getLocation() {
		System.out.println("Para : " + player.getMoney());
		System.out.println("1. Silahlar");
		System.out.println("2. Zırhlar");
		System.out.println("3. Çıkış");
		System.out.print("Seçiminiz: ");
		int select = scn.nextInt();
		int selectItemID;
		switch(select) {
		case 1:
			selectItemID = weaponMenu();
			buyWeapon(selectItemID);
		case 2:
			
		default:
		}
		return true;
	}


	private int weaponMenu() {
		System.out.println("1. Tabanca <Para : 25 - Hasar 2>");
		System.out.println("2. Kılıç <Para : 35 - Hasar 3>");
		System.out.println("3. Tüfek <Para : 45 - Hasar 7>");
		System.out.println("4. Çıkış");
		System.out.print("Seçiminiz: ");
		int selectWeaponID = scn.nextInt();
		return selectWeaponID;
	}
	
	private void buyWeapon(int selectItemID) {
		int damage = 0, price = 0;
		String weaponName = null;
		switch(selectItemID) {
		case 1:
			damage = 2;
			weaponName = "Tabanca";
			price = 25;
			break;
		case 2:
			damage = 3;
			weaponName = "Kılıç";
			price = 35;
			break;
		case 3:
			damage = 7;
			weaponName = "Tüfek";
			price = 45;
			break;
		default:
			System.out.println("Geçersiz işlem.");
			break;
		}
		if(player.getMoney() > price) {
			player.getInventory().setDamage(damage);
			player.setDamage(player.getDamage()+damage);
			player.getInventory().setWeaponName(weaponName);
			player.setMoney(player.getMoney() - price);
			System.out.println("Yeni hasarınız: " + player.getDamage() + " -- Kalan paranız: " + player.getMoney());
		}
		else {
			System.out.println("Paranız yetmiyor...");
		}
	}
}























