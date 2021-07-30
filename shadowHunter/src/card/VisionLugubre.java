package card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import character.Role;

public class VisionLugubre extends Card {

	protected List<Role> condition = new ArrayList<Role>(Arrays.asList(Role.SHADOW));

	public VisionLugubre() {
		super("Vision lugubre", CardAlignement.VISION, CardType.INSTANTUSE);
	}
	
	public List<Role> getCondition() {return this.condition;}
	
	public void effect() {
		//Soigne une blessure (si pas de blessure prend une blessure)
	}

}
