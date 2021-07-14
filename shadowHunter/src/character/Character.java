package character;

public abstract class Character {
	protected int lp;
	protected String name;
	protected Role role;
	
	public int getLp() {
		return lp;
	}
	
	public String getName() {
		return name;
	}
	
	public Role getRole() {
		return role;
	}
	
	public Character(int lp,String name,Role role) {
		this.lp = lp;
		this.name = name;
		this.role = role;
	}
	
	public abstract void capacity();
	public abstract void victoryCondition();
}
