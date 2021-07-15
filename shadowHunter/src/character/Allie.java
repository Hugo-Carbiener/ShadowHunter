package character;

import controller.Game;

public class Allie extends Character {

	public Allie() {
		super(8,"Allie",Role.NEUTRAL);
	}
	
	@Override
	public void capacity() {
		// full heal
		//unique
	}

	public boolean victoryCondition(Game game) {
		// etre en vie � la fin de la game
		return false;
	}

}
