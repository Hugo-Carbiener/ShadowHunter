package area;

import java.util.ArrayList;
import java.util.List;

import card.Card;
import controller.Game;
import player.Player;

public class SanctuaireAncien extends Area {
	
	public SanctuaireAncien() {
		super();
		this.values.add(10);
		this.name = "Sanctuaire Ancien";
	}
	
	public void effect(Game game) {
		//Vous pouvez voler une carte �quipement � un autre joueur
		List<Player> playersEquipment = new ArrayList<>();
		for(Player p : game.getAlivePlayers()) {
			if(!p.getEquipment().isEmpty() && !p.getID().equals(game.getCurrentPlayer().getID())) {
				playersEquipment.add(p);
			}
		}
		if(playersEquipment.isEmpty()) {
			System.out.println("There is no players with equipment cards\n");
			return;
		}
		int cpt = 0;
		int choosenPlayer = -1;
		String str = "-> Cards : ";
		while(choosenPlayer < 0 || choosenPlayer >= playersEquipment.size()) {
			System.out.println("Choose your target among the players who has equipment cards :");
			for(Player p : playersEquipment) {
				System.out.println(" " + p.getID() + " : " + cpt);
				for(Card card : p.getEquipment()) {
					str = str + card.getName() + " | ";
				}
				str = str.substring(0, str.length()-3);
				System.out.println(str);
				str = "-> Cards : ";
				cpt++;
			}
			cpt = 0;
			choosenPlayer = game.prompt();
		}
		Player player = playersEquipment.get(choosenPlayer);
		int choosenEquipment = -1;
		while(choosenEquipment < 0 || choosenEquipment >= player.getEquipment().size()) {
			System.out.println("Choose the equipment card you want to steal :");
			for(Card card : player.getEquipment()) {
				System.out.println(" " + card.getName() + " : " + cpt);
				cpt++;
			}
			cpt = 0;
			choosenEquipment = game.prompt();
		}
		Card card = player.getEquipment().remove(choosenEquipment);
		game.getCurrentPlayer().addEquipment(card);
		
		System.out.println("List of cards of the choosen player :");
		for(Card c : player.getEquipment()) {
			System.out.println(" " + c.getName());
		}
		System.out.println("List of current player cards :");
		for(Card c : game.getCurrentPlayer().getEquipment()) {
			System.out.println(" " + c.getName());
		}
	}

}
