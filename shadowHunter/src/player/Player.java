package player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import area.Area;
import card.Card;
import character.Character;
import controller.Game;

public class Player {
	private boolean isAlive=true;
	private int damageTaken=0;
	private ID id;
	private Character character;
	private List<Card> equipment;
	private Area currentArea;
	private List<Player> killList = new ArrayList<>();
	
	
	public static Random rand = new Random(); 
	
	public int diceArea() {
		return (rand.nextInt(6 - 1 + 1) + 1 ) + (rand.nextInt(4 - 1 + 1) + 1);
	}
	
	public int diceDamage() {
		
		return Math.abs((rand.nextInt(6 - 1 + 1) + 1 ) - (rand.nextInt(4 - 1 + 1) + 1));
	}

	public boolean getIsAlive() {return isAlive;}
	
	public ID getID() {return id;}
	public void setID(ID id) {this.id = id;}
	
	public int getDamageTaken() {return damageTaken;}
	public void setDamageTaken(int damageTaken) {this.damageTaken = damageTaken;}

	public void addEquipment(Card card) {this.equipment.add(card);}
	
	public List<Card> getEquipment() {return equipment;}
	public void deleteEquipment(Card card) {this.equipment.remove(card);}

	public Character getCharacter() {return character;}

	public Area getCurrentArea() {return currentArea;}
	public void setCurrentArea(Area currentArea) {this.currentArea = currentArea;}

	public boolean isAlive() {return isAlive;}
	public void setAlive(boolean isAlive) {this.isAlive = isAlive;}
	
	public void setCharacter(Character character) {
		this.character=character;
	}
	
	public List<Player> getKillList() {return this.killList;}
	
	
	public boolean takeDamage(int damage) {
		this.damageTaken+=damage;
		if(this.damageTaken >= this.character.getLp())
			this.isAlive=false;
		return this.isAlive;
	}
	
	public void checkIfAlive() {
		if (this.damageTaken >= this.character.getLp()) {
			isAlive = false;
		}
	}
}


