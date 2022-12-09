package location.safelocation.com;

import player.com.Player;

public class SafeHouse extends SafeLocation{

	public SafeHouse(Player player) {
		super(player, "Güvenli ev");
	}
	
	public boolean getLocation() {
		player.setHealthy(player.getDefaultHealthy());
		System.out.println("------------------------------");
		System.out.println("Sağlığınız iyileştirildi!");
		System.out.println("Şuan güvenli evdesiniz!");
		
		return true;
	}

}
