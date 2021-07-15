package character;

import java.util.List;

import card.Amulette;
import card.Card;
import card.CrucifixEnArgent;
import card.LanceDeLonginus;
import card.TogeSainte;
import controller.Game;

public class David extends Character {

	public David() {
		super(13,"David",Role.NEUTRAL);
	}
	
	@Override
	public void capacity() {
		// R�cup dans la d�fausse 1 item
		//unique
	}

	public boolean victoryCondition(Game game) {
		// au moins 3 parmi crucifix en argent,amulette,lance de longinus, toge sainte
		List<Card> inventory = player.getEquipment();
		int counter = 0;
		
		for (Card equipement : inventory) {
			if (equipement instanceof CrucifixEnArgent || equipement instanceof Amulette || equipement instanceof LanceDeLonginus || equipement instanceof TogeSainte) {
				counter++;
			}
		}
		
		if (counter >= 3) {
			return true;
		} else {
			return false;
		}
	}

}
