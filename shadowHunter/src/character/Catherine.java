package character;

public class Catherine extends Character {

	public Catherine() {
		super(11,"Catherine",Role.NEUTRAL);
	}
	
	@Override
	public void capacity() {
		// se guérit 1 blessure au début de son tour

	}

	@Override
	public void victoryCondition() {
		// mourir en premier ou être parmi les deux derniers vivants

	}

}
