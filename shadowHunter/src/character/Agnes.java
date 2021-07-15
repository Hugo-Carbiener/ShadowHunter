package character;

import controller.Game;

public class Agnes extends Character {

	public Agnes() {
		super(8,"Agnès",Role.NEUTRAL);
	}
	
	
	@Override
	public void capacity() {
		// Changer victory condition � ggner avec gauche

	}

	public boolean victoryCondition(Game game) {
		
		//Position of Agnes
		int index = game.getAllPlayers().indexOf(this);
		int targetIndex;
		
		if (HasActivated()) {//wins with the player on the left
			if(index == 0) {
				targetIndex = game.getAllPlayers().size() - 1;
			} else {
				targetIndex = index - 1;
			}
		} else {//wins with the player on the right
			if(index == game.getAllPlayers().size() - 1) {
				targetIndex = 0;
			} else {
				targetIndex = index + 1;
			}
		}
		return game.getAllPlayers().get(targetIndex).getCharacter().victoryCondition(game);
	}
}
