package character;

import controller.Game;

public class Fuka extends Character {

	public Fuka() {
		super(12,"Fu-Ka",Role.HUNTER);
	}
	
	
	@Override
	public void capacity() {
		// au d�but du tour mettre blessure sur 7
		//unique
	}

	@Override
	public boolean victoryCondition(Game game) {
		// Mort shadow
		return false;
	}

}
