package character;

import controller.Game;
import player.Player;

public abstract class Character {
	
	protected int lp;
	protected String name;
	protected Role role;
	protected Player player;
	protected boolean isRevealed = false;
	protected boolean hasActivated = false;
	
	public int getLp() {return lp;}
	public String getName() {return name;}
	public Role getRole() {return role;}
	public Player getPlayer() {return this.player;}
	public void setPlayer(Player player) {this.player = player;}
	public boolean IsRevealed() {return this.isRevealed;}
	public boolean HasActivated() {return this.hasActivated;}
	
	public Character(int lp,String name,Role role) {
		this.lp = lp;
		this.name = name;
		this.role = role;
	}
	
	public abstract void capacity();
	public abstract boolean victoryCondition(Game game);
}
