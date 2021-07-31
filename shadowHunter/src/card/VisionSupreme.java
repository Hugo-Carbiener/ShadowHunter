package card;

import java.util.ArrayList;
import java.util.List;

import character.Role;

public class VisionSupreme extends Card {

	protected List<Role> condition = new ArrayList<Role>(); 	//No condition

	public VisionSupreme() {
		super("Vision suprême", CardAlignement.VISION, CardType.INSTANTUSE);
	}

	public List<Role> getCondition() {return this.condition;}

	public void effect() {
		//Montre moi ton personnage
	}

}
