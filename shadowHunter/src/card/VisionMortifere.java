package card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import character.Role;

public class VisionMortifere extends Card {

	protected List<Role> condition = new ArrayList<Role>(Arrays.asList(Role.HUNTER));

	public VisionMortifere() {
		super("Vision mortifère", CardAlignement.VISION, CardType.INSTANTUSE);
	}

	public List<Role> getCondition() {return this.condition;}

	public void effect() {
		//Subis une blessure
	}

}
