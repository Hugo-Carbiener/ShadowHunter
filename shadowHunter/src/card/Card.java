package card;

public abstract class Card {
	
	protected String name;
	
	public String getName() {
		return this.name;
	}
	
	public abstract void effect();
}
