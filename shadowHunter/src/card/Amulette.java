package card;

public class Amulette extends Card {

	protected CardAlignement LIGHT;
	protected CardType EQUIPEMENT;
	
	public Amulette() {
		this.name = "Amulette";
	}
	
	public void effect() {
		/* Vous ne subissez aucune Blessure causée par les cartes Darkness :
		 * Araignée sanguinaire, Dynamite ou Chauve-souris vampire
		 */

	}

}
