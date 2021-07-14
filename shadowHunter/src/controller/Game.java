package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Character.Agnes;
import Character.Allie;
import Character.Bob;
import Character.Bryan;
import Character.Catherine;
import Character.Character;
import Character.Charles;
import Character.Daniel;
import Character.David;
import Character.Ellen;
import Character.Emi;
import Character.Franklin;
import Character.Fuka;
import Character.George;
import Character.Gregor;
import Character.Liche;
import Character.LoupGarou;
import Character.Metamorphe;
import Character.Momie;
import Character.Valkyrie;
import Character.Vampire;
import card.Card;
import player.Player;

public class Game {
	
	private int nbPlayer;
	private int actualPLayer;
	private List<Card> deckLight;
	private List<Card> deckDarkness;
	private List<Card> deckVision;
	private List<Player> playerList;
	public static Random rand = new Random(); 
	
	public void init() {
		
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
