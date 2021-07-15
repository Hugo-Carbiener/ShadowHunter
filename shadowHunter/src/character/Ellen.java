package character;

import controller.Game;
import player.Player;

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
		
		boolean shadowsLeft = false;
		//Check if some shadows are still alive
		for(Player player : game.getAlivePlayers()) {
			if (player.getCharacter().role == Role.SHADOW) {
				shadowsLeft = true; //There are still shadows left, hunter hasn't won yet
			}
		}
		
		//If there is no shadows left, hunter has won
		if (! shadowsLeft) {
			return true;
		} else {
			return false;
		}
	}
}
