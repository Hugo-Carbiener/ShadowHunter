package Character;

public class Bryan extends Character {

	public Bryan() {
		super(10,"Bryan",Role.NEUTRAL);
	}
	
	@Override
	public void capacity() {
		// se r�v�le s'il tue qqn avec lp<13

	}

	@Override
	public void victoryCondition() {
		// tue qqn avec lp > 13 ou est dans sanctuaire ancien � la fin de la game
	}

}
