package area;

import controller.Game;

public class AntreDeLermite extends Area{
	
	public AntreDeLermite() {
		super();
		this.values.add(2);
		this.values.add(3);
		this.name = "Antre de l'Ermite";
	}
	
	public void effect(Game game) {
		//Vous pouvez piocher une carte Vision
		game.playVisionCard();
	}
	
}
