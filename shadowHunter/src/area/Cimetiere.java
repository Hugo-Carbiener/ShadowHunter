package area;

import controller.Game;

public class Cimetiere extends Area{
	
	public Cimetiere() {
		super();
		this.values.add(8);
		this.name = "Cimeti�re";
	}
	
	public void effect(Game game) {
		//Vous pouvez piocher une carte T�n�bres
		game.playDarknessCard();
	}

}
