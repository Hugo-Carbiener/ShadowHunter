package card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import character.Role;

public class VisionLugubre extends Card {

	protected String name = "Vision lugubre";
	protected CardAlignement VISION;
	protected List<Role> Condition = new ArrayList<Role>(Arrays.asList(Role.SHADOW));

	public void effect() {
		//Soigne une blessure (si pas de blessure prend une blessure)
	}

}
