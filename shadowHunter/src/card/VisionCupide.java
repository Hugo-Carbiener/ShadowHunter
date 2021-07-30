package card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import character.Role;

public class VisionCupide extends Card {
	
	protected List<Role> condition = new ArrayList<Role>(Arrays.asList(Role.NEUTRAL, Role.SHADOW));
	
	public VisionCupide() {
		super("Vision cupide", CardAlignement.VISION, CardType.INSTANTUSE);
	}
	
	public List<Role> getCondition() {return this.condition;}
	
	public void effect() {
		//Soit me donner un equipement soit prendre un dégat 
	}
}
