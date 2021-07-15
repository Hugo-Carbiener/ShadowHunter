package card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import character.Role;

public class VisionCupide extends Card {
	
	protected String name = "Vision Cupide";
	protected CardAlignement VISION;
	protected List<Role> Condition = new ArrayList<Role>(Arrays.asList(Role.NEUTRAL, Role.SHADOW));
	
	public void effect() {
		//Soit me donner un equipement soit prendre un dégat 
	}

}
