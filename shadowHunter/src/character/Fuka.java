package character;

import controller.Game;
import player.Player;

public class Fuka extends Character {

	public Fuka() {
		super(12,"Fu-Ka",Role.HUNTER);
	}
	
	
	@Override
	public void capacity() {
		// au d�but du tour mettre blessure sur 7
		//unique
	}

	public boolean victoryCondition(Game game) {
		
		boolean shadowsLeft = false;
		//Check if some shadows are still alive
		for(Player player : game.getPlayer()) {
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
