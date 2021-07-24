package card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import character.Role;

public class VisionFoudroyante extends Card {

	protected CardAlignement VISION;
	protected List<Role> Condition = new ArrayList<Role>(Arrays.asList(Role.SHADOW));
	
	public VisionFoudroyante() {
		this.name = "Vision foudroyante";
	}

	public void effect() {
		//Subit une blessure
	}

}
