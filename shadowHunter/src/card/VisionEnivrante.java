package card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import character.Role;

public class VisionEnivrante extends Card {

	protected List<Role> condition = new ArrayList<Role>(Arrays.asList(Role.NEUTRAL, Role.HUNTER));

	public VisionEnivrante() {
		super("Vision enivrante", CardAlignement.VISION, CardType.INSTANTUSE);
	}

	public List<Role> getCondition() {return this.condition;}

	public void effect() {
		//Soit me donner un equipement soit prendre un dégat

	}

}
