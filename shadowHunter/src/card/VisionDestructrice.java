package card;

public class VisionDestructrice extends Card {

	//protected List<Role> condition = new ArrayList<Role>(Arrays.asList(Role.NEUTRAL, Role.SHADOW));
	//Condition : personnage de 12 pv ou plus : D F G L V
	
	public VisionDestructrice() {
		super("Vision destructrice", CardAlignement.VISION, CardType.INSTANTUSE);
	}
	
	//public List<Role> getCondition() {return this.condition;}
	
	public void effect() {
		//subis deux blessures

	}

}
