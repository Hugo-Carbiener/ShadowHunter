package card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Character.Role;

public class VisionFurtive extends Card {

	protected CardAlignement VISION;
	protected List<Role> Condition = new ArrayList<Role>(Arrays.asList(Role.HUNTER, Role.SHADOW));

	public void effect() {
		//Me donner un equipement ou prendre une blessure
	}

}
