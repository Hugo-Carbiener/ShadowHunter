package character;

import controller.Game;

public class Catherine extends Character {

	public Catherine() {
		super(11,"Catherine",Role.NEUTRAL);
	}
	
	@Override
	public void capacity() {
		// se gu�rit 1 blessure au d�but de son tour

	}

	public boolean victoryCondition(Game game) {
		// mourir en premier ou �tre parmi les deux derniers vivants
		return false;
	}

}
