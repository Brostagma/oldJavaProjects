package location.battlelocation.com;

import location.com.Location;
import monster.com.Monster;
import player.com.Player;

public abstract class BattleLocation extends Location {
	Monster monster;
	BattleLocation(Player player, String name, Monster monster) {
		super(player);
		this.monster = monster;
		this.name = name;
	}
	
	public boolean getLocation() {
		return true;
	}

}
