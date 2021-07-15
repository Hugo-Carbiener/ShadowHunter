package area;

import controller.Game;

public class Monastere extends Area {
	
	public Monastere() {
		super();
		this.values.add(6);
		this.name = "Monastère";
	}
	
	public void effect(Game game) {
		//Vous pouvez piocher une carte Lumière
		game.playLightCard();
	}
	
}
