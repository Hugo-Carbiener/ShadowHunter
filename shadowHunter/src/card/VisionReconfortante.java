package card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import character.Role;

public class VisionReconfortante extends Card {

	protected String name = "Vision réconfortante";
	protected CardAlignement VISION;
	protected List<Role> Condition = new ArrayList<Role>(Arrays.asList(Role.NEUTRAL));

	public void effect() {
		//Soigne une blessure (si pas de blessure prends en une)
	}

}
