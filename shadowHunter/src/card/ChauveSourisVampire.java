package card;

public class ChauveSourisVampire extends Card {

	public ChauveSourisVampire() {
		super("Chauve-souris vampire", CardAlignement.DARKNESS, CardType.INSTANTUSE);
	}

	public void effect() {
		//Infliger 2 blessures au joueur de votre choix puis soigner une de vos blessures
	}

}
