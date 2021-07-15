package card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import character.Role;

public class VisionEnivrante extends Card {

	protected String name = "Vision enivrante";
	protected CardAlignement VISION;
	protected List<Role> Condition = new ArrayList<Role>(Arrays.asList(Role.NEUTRAL, Role.HUNTER));
	
	public void effect() {
		//Soit me donner un equipement soit prendre un dégat 

	}

}
