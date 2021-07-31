package card;

import java.util.List;

public class VisionClairvoyante extends Card {

	public VisionClairvoyante() {
		super("Vision clairvoyante", CardAlignement.VISION, CardType.INSTANTUSE);
	}

	//protected List<Role> condition = new ArrayList<Role>(Arrays.asList(Role.NEUTRAL, Role.SHADOW));
	//Condition : personnageq avec 11 pv ou moins : A B C E M

	//public List<Role> getCondition() {return this.condition;}

	public void effect() {
		//subis une blessure
	}

}
