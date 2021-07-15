package player;

import java.util.List;
import java.util.Random;
import Character.Character;
import area.Area;
import card.Card;
import controller.Game;

public class Player {
	private boolean isAlive=true;
	private int damageTaken=0;
	private ID id;
	private Character character;
	private List<Card> equipment;
	private Area currentArea;
	
	
	public static Random rand = new Random(); 
	
	public int diceArea() {
		return (rand.nextInt(6 - 1 + 1) + 1 ) + (rand.nextInt(4 - 1 + 1) + 1);
	}
	
	public int diceDamage() {
		
		return Math.abs((rand.nextInt(6 - 1 + 1) + 1 ) - (rand.nextInt(4 - 1 + 1) + 1));
	}

	public ID getID() {
		return id;
	}
	
	public Player(ID id,Character character) {
		this.id=id;
		this.character=character;
		
	}

	public int getDamageTaken() {
		return damageTaken;
	}

	public void setDamageTaken(int damageTaken) {
		this.damageTaken = damageTaken;
	}

	public List<Card> getEquipment() {
		return equipment;
	}

	public void addEquipment(Card card) {
		this.equipment.add(card);
	}
	
	public void deleteEquipment(Card card) {
		this.equipment.remove(card);
	}

	public Character getCharacter() {
		return character;
	}

	public Area getCurrentArea() {
		return currentArea;
	}

	public void setCurrentArea(Area currentArea) {
		this.currentArea = currentArea;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	
	
	public boolean takeDamage(int damage) {
		this.damageTaken+=damage;
		if(this.damageTaken >= this.character.getLp())
			this.isAlive=false;
		return this.isAlive;
	}
	
}
