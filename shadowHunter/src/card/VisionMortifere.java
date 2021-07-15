package card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import character.Role;

public class VisionMortifere extends Card {

	protected CardAlignement VISION;
	protected List<Role> Condition = new ArrayList<>(Arrays.asList(Role.HUNTER));

	public void effect() {
		//Subis une blessure
	}

}
