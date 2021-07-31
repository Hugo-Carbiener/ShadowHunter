package card;

public class PoupeeDemoniaque extends Card {

	public PoupeeDemoniaque() {
		super("Poupée démoniaque", CardAlignement.DARKNESS, CardType.INSTANTUSE);
	}

	public void effect() {
		//Désigner un joueur. 1 D6. 1 a 4 : lui inflige 3 blessures. 5 ou 6 : subissez 3 blessures
	}

}
