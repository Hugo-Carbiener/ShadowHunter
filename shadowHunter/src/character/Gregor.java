package character;

import controller.Game;
import player.Player;

public class Gregor extends Character {

	public Gregor() {
		super(14,"Gregor",Role.HUNTER);
	}
	
	
	@Override
	public void capacity() {
		// Pas de blessure jusqu'a le prochain tour
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
