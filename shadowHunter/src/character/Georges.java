package character;

import controller.Game;
import player.Player;

public class Georges extends Character {

	public Georges() {
		super(14,"Georges",Role.HUNTER);
	}
	
	@Override
	public void capacity() {
		// d� 4 de d�gat
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
