package card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import character.Role;

public class VisionFurtive extends Card {

	protected String name = "Vision furtive";
	protected CardAlignement VISION;
	protected List<Role> Condition = new ArrayList<Role>(Arrays.asList(Role.HUNTER, Role.SHADOW));

	public void effect() {
		//Me donner un equipement ou prendre une blessure
	}

}
