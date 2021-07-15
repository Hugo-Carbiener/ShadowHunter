package character;

import controller.Game;

public class Bob extends Character{
	
	public Bob() {
		super(10,"Bob",Role.NEUTRAL);
	}
	
	public void capacity() {
		//si d�gats inflig� >=2 alors peut voler �quiper plutot que d�gats
	}
	
	public boolean victoryCondition(Game game) {
		if (player.getEquipment().size() >= 5) {
			return true;
		} else {
			return false;
		}
	}
}
