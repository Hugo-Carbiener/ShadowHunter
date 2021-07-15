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
		//Be the first to die
		if (! player.getIsAlive() && game.getAlivePlayers().size() == game.getNbPlayer() - 1) {
			return true;
		} else if (player.getIsAlive() && game.getNbPlayer() <= 2) {//Be one of the two last characters alive
			return true;
		} else {
			return false;
		}
	}
}
