package character;

import controller.Game;
import player.Player;

public class Daniel extends Character {

	public Daniel() {
		super(13,"Daniel",Role.NEUTRAL);
	}
	
	@Override
	public void capacity() {
		//r�v�le d�s que qqn meurt
		//unique
	}

	public boolean victoryCondition(Game game) {
		
		//if is the first dead
		if (! player.getIsAlive() && game.getAlivePlayers().size() == game.getNbPlayer() - 1) {
			return true;
		}
		
		//if all shadows dead 
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
