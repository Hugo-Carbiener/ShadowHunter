package card;

public class BarreDeChocolat extends Card {
	
	protected CardAlignement LIGHT;
	protected CardType INSTANTUSE;
	
	public BarreDeChocolat() {
		this.name = "Barre de chocolat";
	}
	
	public void effect() {
		/* Si vous êtes Allie, Agnès, Emi, Momie ou Métamorphe
		 * et que vous choisissez (ou avez déjà) de révéler votre identité
		 * vous soignez toutes vos Blessures
		 */
	}

}
