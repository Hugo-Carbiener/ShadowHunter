package character;

import player.Player;

public abstract class Character {
	
	protected int lp;
	protected String name;
	protected Role role;
	protected Player player;
	
	public int getLp() {return lp;}
	public String getName() {return name;}
	public Role getRole() {return role;}
	public Player getPlayer() {return this.player;}
	public void setPlayer(Player player) {this.player = player;}
	
	public Character(int lp,String name,Role role) {
		this.lp = lp;
		this.name = name;
		this.role = role;
	}
	
	public abstract void capacity();
	public abstract boolean victoryCondition();
}
