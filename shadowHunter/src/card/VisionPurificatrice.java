package card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import character.Role;

public class VisionPurificatrice extends Card {

	protected List<Role> condition = new ArrayList<Role>(Arrays.asList(Role.SHADOW));

	public VisionPurificatrice() {
		super("Vision purificatrice", CardAlignement.VISION, CardType.INSTANTUSE);
	}

	public List<Role> getCondition() {return this.condition;}

	public void effect() {
		//subis deux blessures

	}

}
