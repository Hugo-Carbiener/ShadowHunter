package character;

import controller.Game;

public class David extends Character {

	public David() {
		super(13,"David",Role.NEUTRAL);
	}
	
	@Override
	public void capacity() {
		// R�cup dans la d�fausse 1 item
		//unique
	}

	public boolean victoryCondition(Game game) {
		// au moins 3 parmi crucifix en argent,amulette,lance de longinus, toge sainte
		return false;
	}

}
