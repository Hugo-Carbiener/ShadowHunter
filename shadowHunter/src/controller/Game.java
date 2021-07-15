package controller;

import java.util.List;

import card.Card;
import player.Player;

public class Game {
	
	private int nbPlayer;
	private Player actualPlayer;
	private List<Player> playerList;
	private List<Card> drawLight;
	private List<Card> drawDarkness;
	private List<Card> drawVision;
	
	public void init() {
		
	}
	
	public void start() {
		
	}
	
	public void loop() {
		
	}
	
	public void end() {
		
	}
	
	
	public void playVisionCard() {
		Card drawCard = this.drawVision.remove(this.drawVision.size()-1);
		drawCard.effect(); //Faudra passer l'instance courante de Game en paramètre pour activer l'effet de la carte
	}
	
	public void playDarknessCard() {
		Card drawCard = this.drawDarkness.remove(this.drawDarkness.size()-1);
		drawCard.effect(); //Faudra passer l'instance courante de Game en paramètre pour activer l'effet de la carte
	}
	
	public void playLightCard() {
		Card drawCard = this.drawLight.remove(this.drawLight.size()-1);
		drawCard.effect(); //Faudra passer l'instance courante de Game en paramètre pour activer l'effet de la carte
	}
	
	public List<Player> getPlayerList() {
		return this.playerList;
	}
	
	public Player getActualPlayer() {
		return this.actualPlayer;
	}
	
	public int prompt() {
		return 0;
	}

}
