package card;

import java.util.ArrayList;
import java.util.List;

import character.Role;

public class VisionSupreme extends Card {

	protected CardAlignement VISION;
	protected List<Role> Condition = new ArrayList<Role>(); 	//No condition
	
	public VisionSupreme() {
		this.name = "Vision supr�me";
	}
	

	public void effect() {
		//Montre moi ton personnage
	}

}
