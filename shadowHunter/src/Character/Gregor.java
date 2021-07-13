package Character;

public class Gregor extends Character {

	public Gregor() {
		super(14,"Gregor",Role.HUNTER);
	}
	
	
	@Override
	public void capacity() {
		// Pas de blessure jusqu'a le prochain tour
		//unique
	}

	@Override
	public void victoryCondition() {
		// Mort Shadow

	}

}
