package character;

import controller.Game;

public class Emi extends Character {
	public Emi() {
		super(10,"Emi",Role.HUNTER);
	}
	
	public void capacity() {
		//d�placer au lieu adjacent � la place de lancer les d�s
	}
	
	public boolean victoryCondition(Game game) {
		//Mort des shadow
		return false;
	}
}
