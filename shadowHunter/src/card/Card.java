package card;

public abstract class Card {
	
	protected String name;
	protected CardAlignement alignement;
	protected CardType type;
	
	public Card(String name, CardAlignement alignement, CardType type) {
		this.name = name;
		this.alignement = alignement;
		this.type = type;
	}
	
	public String getName() {return this.name;}
	public CardAlignement getCardAlignement() {return this.alignement;}
	public CardType getCardType() {return this.type;}
	
	public abstract void effect();
}
