package area;

import controller.Game;
import player.Player;

public class ForetHantee extends Area{
	
	public ForetHantee() {
		super();
		this.values.add(9);
		this.name = "For�t Hant�e";
	}
	
	public void effect(Game game) {
		//Le joueur de votre choix peut subir 2 Blessures ou soigner 1 Blessure
		int cpt = 0;
		int choosenPlayer = -1;
		int choosenAction = -1;
		while(choosenPlayer < 0 || choosenPlayer >= game.getPlayerList().size()) {
			System.out.println("Choose your target among the players alive :");
			for(Player p : game.getPlayerList()) {
				System.out.println(" " + p.getID() + " : " + cpt);
				cpt++;
			}
			cpt = 0;
			choosenPlayer = game.prompt();
		}
		while(choosenAction != 0 && choosenAction != 1) {
			System.out.println("\nChoose the action you want to do :\n 2 Wound : 0\n 1 Heal : 1\n");
			choosenAction = game.prompt();
		}
		Player player = game.getPlayerList().get(choosenPlayer);
		if(choosenAction == 0) {
			player.setDamageTaken(player.getDamageTaken() + 2);
		}
		else {
			player.setDamageTaken(player.getDamageTaken() - 1);
			if(player.getDamageTaken() < 0) {
				player.setDamageTaken(0);
			}
		}
	}

}
