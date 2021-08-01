package character;

import controller.Game;
import player.Player;

public class Bryan extends Character {

	public Bryan() {
		super(10,"Bryan",Role.NEUTRAL);
	}
	
	@Override
	public void capacity() {
		// se r�v�le s'il tue qqn avec lp<13

	}

	public boolean victoryCondition(Game game) {
	
		for (Player each : this.getPlayer().getKillList()) {
			if (each.getCharacter().getLp() > 13) {
				return true;
			}
		}
		// tue qqn avec lp > 13 ou est dans sanctuaire ancien � la fin de la game
		return false;
	}

}
