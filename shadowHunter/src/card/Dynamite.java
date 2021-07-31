package card;

public class Dynamite extends Card {

	public Dynamite() {
		super("Dynamite", CardAlignement.DARKNESS, CardType.INSTANTUSE);
	}

	public void effect() {
		//1 D4 + 1 D6 et infliger 3 blessures à tous les joueurs dans la zone désignée. Rien si 7
	}

}
