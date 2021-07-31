package card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import character.Role;

public class VisionFurtive extends Card {

	protected List<Role> condition = new ArrayList<Role>(Arrays.asList(Role.HUNTER, Role.SHADOW));

	public VisionFurtive() {
		super("Vision furtive", CardAlignement.VISION, CardType.INSTANTUSE);
	}

	public List<Role> getCondition() {return this.condition;}

	public void effect() {
		//Me donner un equipement ou prendre une blessure
	}

}
