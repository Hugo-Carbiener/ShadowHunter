package Character;

public class Charles extends Character {

	public Charles() {
		super(11,"Charles",Role.NEUTRAL);
	}
	
	@Override
	public void capacity() {
		// peut re attaquer le mm joueur si s'inflige 2 dgt
		//unique
	}

	@Override
	public void victoryCondition() {
		// tuer qqn dès que mort >=3

	}

}
