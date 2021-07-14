package character;

public class Daniel extends Character {

	public Daniel() {
		super(13,"Daniel",Role.NEUTRAL);
	}
	
	@Override
	public void capacity() {
		//révèle dès que qqn meurt
		//unique
	}

	@Override
	public void victoryCondition() {
		// premier à mourir sinon avec les hunter

	}

}
