package card;

public class BarreDeChocolat extends Card {
	
	protected CardAlignement LIGHT;
	protected CardType INSTANTUSE;
	
	public BarreDeChocolat() {
		this.name = "Barre de chocolat";
	}
	
	public void effect() {
		/* Si vous �tes Allie, Agn�s, Emi, Momie ou M�tamorphe
		 * et que vous choisissez (ou avez d�j�) de r�v�ler votre identit�
		 * vous soignez toutes vos Blessures
		 */
	}

}
