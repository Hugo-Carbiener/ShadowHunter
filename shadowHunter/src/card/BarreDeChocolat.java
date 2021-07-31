package card;

public class BarreDeChocolat extends Card {

	public BarreDeChocolat() {
		super("Barre de chocolat", CardAlignement.LIGHT, CardType.INSTANTUSE);
	}

	public void effect() {
		/* Si vous �tes Allie, Agn�s, Emi, Momie ou M�tamorphe
		 * et que vous choisissez (ou avez d�j�) de r�v�ler votre identit�
		 * vous soignez toutes vos Blessures
		 */
	}

}
