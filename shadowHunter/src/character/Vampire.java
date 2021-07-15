package character;

import controller.Game;
import player.Player;

public class Vampire extends Character {

	public Vampire() {
		super(13,"Vampire",Role.SHADOW);
	}
	
	@Override
	public void capacity() {
		// heal deux quand inflige dgts avec attaque

	}

	public boolean victoryCondition(Game game) {
		
		boolean huntersLeft = false;
		boolean neutralsLeft = false;
		//Check if some hunters are still alive
		for(Player player : game.getAlivePlayers()) {
			if (player.getCharacter().role == Role.HUNTER) {
				huntersLeft = true; //There are still hunters left, shadow hasn't won yet
			}
		}
		//Check if some neutrals are still alive
		for(Player player : game.getAlivePlayers()) {
			if (player.getCharacter().role == Role.NEUTRAL) {
				neutralsLeft = true;
			}
		}
		
		if (! huntersLeft) {
			return true;
		} else if (game.getNbPlayer() == 7 && !(neutralsLeft)) {
			return true;
		} else {
			return false;
		}
	}
}
