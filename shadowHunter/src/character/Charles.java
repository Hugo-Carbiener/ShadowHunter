package character;

import controller.Game;

public class Charles extends Character {

	public Charles() {
		super(11,"Charles",Role.NEUTRAL);
	}
	
	@Override
	public void capacity() {
		// peut re attaquer le mm joueur si s'inflige 2 dgt
		//unique
	}

	public boolean victoryCondition(Game game) {
		// tuer qqn d�s que mort >=3
		return false;
	}

}
