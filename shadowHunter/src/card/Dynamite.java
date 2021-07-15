package card;

public class Dynamite extends Card {

	protected String name = "Dynamite";
	protected CardType INSTANTUSE;
	protected CardAlignement DARKNESS;
	
	public void effect() {
		//1 D4 + 1 D6 et infliger 3 blessures à tous les joueurs dans la zone désignée. Rien si 7
	}

}
