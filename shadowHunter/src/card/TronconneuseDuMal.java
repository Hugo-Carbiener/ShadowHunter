package card;

public class TronconneuseDuMal extends Card{

	public TronconneuseDuMal() {
		super("Tronconneuse du mal", CardAlignement.DARKNESS, CardType.EQUIPEMENT);
	}

	public void effect() {
		//+1 blessure si on en inflige
	}
}
