package character;

import controller.Game;

public class Ellen extends Character {

	public Ellen() {
		super(10,"Ellen",Role.HUNTER);
	}
	
	
	@Override
	public void capacity() {
		// perte de capacit� pour la cible
		//unique
	}

	public boolean victoryCondition(Game game) {
		// mort shadow
		return false;
	}

}
