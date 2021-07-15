package character;

import controller.Game;

public class George extends Character {

	public George() {
		super(14,"Georges",Role.HUNTER);
	}
	
	@Override
	public void capacity() {
		// d� 4 de d�gat
		//unique
	}

	@Override
	public boolean victoryCondition(Game game) {
		// Mort Shadow
		return false;
	}

}
