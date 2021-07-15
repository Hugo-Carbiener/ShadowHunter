package area;

import controller.Game;

public class Cimetiere extends Area{
	
	public Cimetiere() {
		super();
		this.values.add(8);
		this.name = "Cimetière";
	}
	
	public void effect(Game game) {
		//Vous pouvez piocher une carte Ténèbres
		game.playDarknessCard();
	}

}
