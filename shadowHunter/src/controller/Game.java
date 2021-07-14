package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import card.Card;
import character.*;
import character.Character;
import player.Player;
import card.*;

public class Game {

	private int nbPlayer;
	private Player actualPlayer;
	private List<Card> deckLight;
	private List<Card> deckDarkness;
	private List<Card> deckVision;
	private List<Player> playerList;
	public static Random rand = new Random();

	public void init() {
		deckSetup();
	}

	public void deckSetup() {
		//Light deck creation
		deckLight.add(new EauBenite());
		deckLight.add(new EauBenite());
		deckLight.add(new BarreDeChocolat());
		deckLight.add(new BarreDeChocolat());
		deckLight.add(new SavoirAncestral());
		deckLight.add(new Amulette());
		deckLight.add(new BrocheDeChance());
		deckLight.add(new AvenementSupreme());
		deckLight.add(new MiroirDivin());
		deckLight.add(new EclairPurificateur());
		deckLight.add(new PremiersSecours());
		deckLight.add(new CrucifixEnArgent());
		deckLight.add(new TogeSainte());
		deckLight.add(new BoussoleMystique());
		deckLight.add(new LanceDeLonginus());
		deckLight.add(new AngeGardien());
		deckLight.add(new Benediction());

		//Darkness deck creation
		deckDarkness.add(new ChauveSourisVampire());
		deckDarkness.add(new ChauveSourisVampire());
		deckDarkness.add(new ChauveSourisVampire());
		deckDarkness.add(new SuccubeTentatrice());
		deckDarkness.add(new SuccubeTentatrice());
		deckDarkness.add(new PeauDeBanane());
		deckDarkness.add(new Dynamite());
		deckDarkness.add(new MitrailleuseFuneste());
		deckDarkness.add(new TronconneuseDuMal());
		deckDarkness.add(new HacheTueuse());
		deckDarkness.add(new RituelDiabolique());
		deckDarkness.add(new AraigneeSanguinaire());
		deckDarkness.add(new SabreHanteMasamune());
		deckDarkness.add(new RevolverDesTenebres());
		deckDarkness.add(new HachoirMaudit());
		deckDarkness.add(new PoupeeDemoniaque());

		//Vision deck creation
		deckVision.add(new VisionMortifere());
		deckVision.add(new VisionMortifere());
		deckVision.add(new VisionEnivrante());
		deckVision.add(new VisionEnivrante());
		deckVision.add(new VisionFurtive());
		deckVision.add(new VisionFurtive());
		deckVision.add(new VisionCupide());
		deckVision.add(new VisionCupide());
		deckVision.add(new VisionDestructrice());
		deckVision.add(new VisionClairvoyante());
		deckVision.add(new VisionPurificatrice());
		deckVision.add(new VisionFoudroyante());
		deckVision.add(new VisionReconfortante());
		deckVision.add(new VisionLugubre());
		deckVision.add(new VisionDivine());
		deckVision.add(new VisionSupreme());
	}
	public void start() {

	}

	public void loop() {

	}

	public void end() {

	}

	public void characterSetUp() {
		List<Character> allCharacter = this.divisionAllCharacter();
		switch(this.nbPlayer) {
		case 4:
			for(int i =0;i<4;i++) { //suppr les neutres
				allCharacter.remove(0);
			}
			allCharacter.remove(rand.nextInt(3));
			allCharacter.remove(2+rand.nextInt(3));
			break;
		case 5 :
			for(int i=0;i<3;i++) {
				allCharacter.remove(rand.nextInt(4-i));
			}
			allCharacter.remove(1+rand.nextInt(3));
			allCharacter.remove(3+rand.nextInt(3));
			break;
		case 6 :
			for(int i=0;i<2;i++){
				allCharacter.remove(rand.nextInt(4-i));
			}
			allCharacter.remove(2+rand.nextInt(3));
			allCharacter.remove(4+rand.nextInt(3));
			break;
		case 7:
			allCharacter.remove(rand.nextInt(4));
			allCharacter.remove(3+rand.nextInt(3));
			allCharacter.remove(5+rand.nextInt(3));
			break;
		case 8:
			for(int i=0;i<2;i++){
				allCharacter.remove(rand.nextInt(4-i));
			}
			break;
		}
		int randInt;
		for(int i=0;i<this.nbPlayer;i++) {
			randInt=rand.nextInt(this.nbPlayer-i);
			this.playerList.get(i).setCharacter(allCharacter.get(randInt));
			allCharacter.remove(randInt);
		}


	}

	public List<Character> allCharacterCreation(){
		List<Character> allCharacter = new ArrayList<>();

		allCharacter.add(new Agnes());
		allCharacter.add(new Allie());
		allCharacter.add(new Bryan());
		allCharacter.add(new Bob());
		allCharacter.add(new Catherine());
		allCharacter.add(new Charles());
		allCharacter.add(new Daniel());
		allCharacter.add(new David());
		allCharacter.add(new Emi());
		allCharacter.add(new Ellen());
		allCharacter.add(new Franklin());
		allCharacter.add(new Fuka());
		allCharacter.add(new George());
		allCharacter.add(new Gregor());
		allCharacter.add(new Momie());
		allCharacter.add(new Metamorphe());
		allCharacter.add(new LoupGarou());
		allCharacter.add(new Liche());
		allCharacter.add(new Vampire());
		allCharacter.add(new Valkyrie());

		return allCharacter;
	}

	public List<Character> divisionAllCharacter(){
		List<Character> allCharacter = this.allCharacterCreation();
		for(int i=0;i<10;i++) {
			allCharacter.remove(i+rand.nextInt(2));
		}
		return allCharacter;
	}


}
