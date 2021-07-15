package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import area.*;
import card.Card;
import character.*;
import character.Character;
import player.Player;
import area.*;
import card.*;
import player.ID;

public class Game {

	private int nbPlayer;
	private Player actualPlayer;
	private List<Card> deckLight;
	private List<Card> deckDarkness;
	private List<Card> deckVision;
	private List<Area> areaList;
	private List<Player> playerList;
	private List<Area> areaList;
	public static Random rand = new Random();
	public static Scanner sc = new Scanner(System.in);

	public Game() {
		//Initialize player number
		System.out.println("Enter the number of player:");
		int input = prompt();
		while (input<4 || input>8) {
			System.err.println("The number of players should be within 4 and 8.\nPlease retry");
			input = prompt();
		}
		this.nbPlayer = input;
		
		//Initialize card lists
		deckLight = new ArrayList<Card>();
		deckDarkness = new ArrayList<Card>();
		deckVision = new ArrayList<Card>();
		playerList = new ArrayList<Player>();	
		areaList = new ArrayList<Area>();
	}
	
	public List<Area> getAreaList() {return this.areaList;}
	
	public void init() {
		areaSetup();
		deckSetup();	
		areaSetup();
		playersSetup();
		characterSetup();
		this.actualPlayer = this.playerList.get(0);
	}

	public void deckSetup() {
		System.out.println("Deck setup initiated");
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
		System.out.println("Deck setup completed");
	}
	
	public void areaSetup() {
		List<Area> temp = new ArrayList<>();
		temp.add(new AntreDeLermite());
		temp.add(new Cimetiere());
		temp.add(new ForetHantee());
		temp.add(new Monastere());
		temp.add(new PorteDeLoutreMonde());
		temp.add(new SanctuaireAncien());
		
		//Fill areaList randomly
		while(temp.size() > 0) {
			Area tempArea = temp.remove(rand.nextInt(temp.size()));
			areaList.add(tempArea);
		}
	}
	
	
	public int prompt() {
		int input = sc.nextInt();
		//sc.close();
		return input;
	}
	
	
	public void playersSetup() {
		System.out.println("Players setup initiated");
		
		//Generate the players
		for (int i=0; i<nbPlayer; i++) {
			playerList.add(new Player());
		}
		//Link a color to each player from 
		List<ID> availableIDs = new ArrayList<ID>(Arrays.asList(ID.BLUE, ID.GREEN, ID.YELLOW, ID.PURPLE, ID.RED, ID.BLACK, ID.WHITE, ID.ORANGE));
		
		for(int i = 1; i <= nbPlayer; i++) {//for each player
			 System.out.println("Player " + i + ": Choose your color.\n");
			 System.out.println("Available colors are:");
			 for (ID temp : availableIDs) {
				 System.out.println(temp + ": " + temp.ordinal());
			 }
			 
			//get input
			 System.out.println("\nType the number of your color");
			 int input = prompt();
			 while (!(availableIDs.contains(ID.values()[input]))) {
				 System.err.println("This ID is unavailable. Please retry.");
				 System.out.println("Type the number of your color");
				 //get input
				 input = prompt();
			 }
			 
			 //Recover id corresponding to the input
			 ID color = ID.values()[input];
			 playerList.get(i - 1).setID(color);
			 System.out.println("You chose " + color + "\n");
			 availableIDs.remove(color);
		}
		System.out.println("Players setup completed");
	}
	
	public void start() {

	}

	public void loop() {
		int dice,cptArea,attackIndex,actualPlayerIndex=0;
		String attackPossibleString;
		List<Integer> attackPossibleIndex;
		while(!end()) {
			
			do {
				dice = actualPlayer.diceArea();//lance le dé pour déter sa zone
				cptArea=0;
				if(dice!=7) {
					while(cptArea<6 && !this.areaList.get(cptArea).getValues().contains(dice))//on localise l'area en fonction du résultat du dé
					{
						cptArea++;
					}
				}
				else {
					System.out.println("Enter the area you want to go to : \n"
				+this.areaList.get(0)+" : 0\n"+this.areaList.get(1)+" : 1\n"
				+this.areaList.get(2)+" : 2\n"+this.areaList.get(3)+" : 3\n"+this.areaList.get(4)+" : 4\n"+this.areaList.get(5)+" : 5\n");
					cptArea = this.prompt();
					while(cptArea > 5 || cptArea < 0) {
						System.err.println("You need to enter a number between 0 and 5");
						cptArea = this.prompt();
					}
				}
			}while(this.areaList.get(cptArea).equals(this.actualPlayer.getCurrentArea()));//tant qu'il ne va pas se déplacer sur la zone dans laquelle il est
			this.actualPlayer.setCurrentArea(this.areaList.get(cptArea));//se déplace
			System.out.println("You moved to "+this.actualPlayer.getCurrentArea());
			actualPlayer.getCurrentArea().effect();//on applique l'effet de la zone
			
			
			attackPossibleString ="";
			attackPossibleIndex = new ArrayList<Integer>();
			
			List<Integer> attackArea = determineAttackArea(); //donne tous les index des zones attaquables
			for(int i=0;i<this.nbPlayer;i++) {//parcoure tous les joueurs
				if(!this.actualPlayer.equals(this.playerList.get(i)) && inAttackArea(this.playerList.get(i),attackArea)) {
					//si le joueur n'est pas le joueur actuel et que le joueur et dans une zone attaquable
					attackPossibleString+=this.playerList.get(i).getID().name()+" : "+i+"\n";//on ajoute ce joueur dans la liste des joueurs attaquables
					attackPossibleIndex.add(i);
				}
			}
			if(!attackPossibleString.equals("")) {//si une attaque est possible
				System.out.println("You can attack : "+ attackPossibleString); //on print les cibles potentiels
				attackIndex = this.prompt();
				while(!attackPossibleIndex.contains(attackIndex)) {//on vérifie que l'input correspond à une cible potentielle
					System.err.println("You need to enter a number equivalent to one of them : " + attackPossibleString);
					attackIndex = this.prompt();
				}
				dice = this.actualPlayer.diceDamage(); //on lance les dés de dégats
				System.out.println("You dealed "+dice+" damage to the "+this.playerList.get(attackIndex).getID().name());
				this.playerList.get(attackIndex).takeDamage(dice);//on inflige ces dégats au joueur cible
				
				//ajout de vol d'item si mort
			}
			if(actualPlayerIndex < this.nbPlayer-1) //if the player is not the last
				actualPlayerIndex++; //on incremente
			else
				actualPlayerIndex = 0;//sinon on repart au premier joueur
			this.actualPlayer = this.playerList.get(actualPlayerIndex); //on modifie l'actual player
		}
	}
	
	public boolean inAttackArea(Player player,List<Integer> attackArea) {
		for(int areaIndex : attackArea) {
			if(player.getCurrentArea().equals(this.areaList.get(areaIndex)))
				return true;
		}
		return false;
	}
	
	public List<Integer> determineAttackArea(){
		List<Integer> attackArea = new ArrayList<Integer>();
		int i=0;
		while(!this.actualPlayer.getCurrentArea().equals(this.areaList.get(i)))
			i++;
		attackArea.add(i);
		if(i%2==0) {
			attackArea.add(i+1);
		}
		else
		{
			attackArea.add(i-1);
		}
		
		return attackArea;
	}

	public boolean end() {//a modifier
		if(this.actualPlayer.equals(this.playerList.get(nbPlayer-1))) {
			sc.close();
			return true;
		}
		return false;
		
	}

	public void characterSetup() {
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
	
	public void printCharacter() {
		for(int i=0;i<nbPlayer;i++) {
			System.out.println(this.playerList.get(i).getCharacter().getName());
		}
	}


}
