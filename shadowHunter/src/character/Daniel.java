package character;

import controller.Game;

public class Daniel extends Character {

	public Daniel() {
		super(13,"Daniel",Role.NEUTRAL);
	}
	
	@Override
	public void capacity() {
		//r�v�le d�s que qqn meurt
		//unique
	}

	public boolean victoryCondition(Game game) {
		// premier � mourir sinon avec les hunter
		return false;
	}

}
