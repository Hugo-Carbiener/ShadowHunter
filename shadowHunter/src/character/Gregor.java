package character;

import controller.Game;

public class Gregor extends Character {

	public Gregor() {
		super(14,"Gregor",Role.HUNTER);
	}
	
	
	@Override
	public void capacity() {
		// Pas de blessure jusqu'a le prochain tour
		//unique
	}

	@Override
	public boolean victoryCondition(Game game) {
		// Mort Shadow
		return false;
	}

}
