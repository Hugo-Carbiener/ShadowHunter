package character;

import controller.Game;

public class Franklin extends Character {

	public Franklin() {
		super(12,"Franklin",Role.HUNTER);
	}
	
	@Override
	public void capacity() {
		// d� 6 de d�gats
		//unique
	}

	public boolean victoryCondition(Game game) {
		// Mort shadow
		return false;
	}

}
