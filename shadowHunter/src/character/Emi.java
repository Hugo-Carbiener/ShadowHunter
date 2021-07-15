package character;

import controller.Game;
import player.Player;

public class Emi extends Character {
	public Emi() {
		super(10,"Emi",Role.HUNTER);
	}
	
	public void capacity() {
		//d�placer au lieu adjacent � la place de lancer les d�s
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
