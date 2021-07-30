package card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import character.Role;

public class VisionFoudroyante extends Card {

	protected List<Role> condition = new ArrayList<Role>(Arrays.asList(Role.SHADOW));

	public VisionFoudroyante() {
		super("Vision foudroyante", CardAlignement.VISION, CardType.INSTANTUSE);
	}
	
	public List<Role> getCondition() {return this.condition;}
	
	public void effect() {
		//Subit une blessure
	}

}
