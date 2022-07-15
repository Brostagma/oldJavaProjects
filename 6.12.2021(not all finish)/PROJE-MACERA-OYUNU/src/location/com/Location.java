package location.com;

import java.util.Scanner;

import player.com.Player;

public abstract class Location {
	protected Player player;
	protected String name; 
	protected Scanner scn = new Scanner(System.in);
	
	protected Location(Player player){
		this.player = player;
	}
	
	public abstract boolean getLocation();

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
