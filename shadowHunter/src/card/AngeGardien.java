package card;

public class AngeGardien extends Card {

	protected CardAlignement LIGHT;
	protected CardType INSTANTUSE;
	
	public AngeGardien() {
		this.name = "Ange gardien";
	}
	
	public void effect() {
		/* Les attaques ne vous inflifent aucunce Blessure jusqu'au prochain tour
		 * (d�faussez alors cette carte)
		 */

	}

}
