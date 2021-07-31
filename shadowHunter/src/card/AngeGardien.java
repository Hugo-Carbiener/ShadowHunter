package card;

public class AngeGardien extends Card {


	public AngeGardien() {
		super("Ange gardien", CardAlignement.LIGHT, CardType.INSTANTUSE);
	}

	public void effect() {
		/* Les attaques ne vous inflifent aucunce Blessure jusqu'au prochain tour
		 * (d�faussez alors cette carte)
		 */

	}

}
