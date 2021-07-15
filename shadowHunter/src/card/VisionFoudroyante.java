package card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import character.Role;

public class VisionFoudroyante extends Card {

	protected String name = "Vision foudroyante";
	protected CardAlignement VISION;
	protected List<Role> Condition = new ArrayList<Role>(Arrays.asList(Role.SHADOW));

	public void effect() {
		//Subit une blessure
	}

}
