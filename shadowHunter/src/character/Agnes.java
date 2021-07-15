package character;

import controller.Game;

public class Agnes extends Character {

	public Agnes() {
		super(8,"Agnes",Role.NEUTRAL);
	}
	
	
	@Override
	public void capacity() {
		// Changer victory condition � ggner avec gauche

	}

	public boolean victoryCondition(Game game) {
		// gagner avec droite
		return false;
	}

}
