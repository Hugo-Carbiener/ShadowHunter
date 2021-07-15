package area;

import controller.Game;

public class PorteDeLoutreMonde extends Area {
	
	public PorteDeLoutreMonde() {
		super();
		this.values.add(4);
		this.values.add(5);
		this.name = "Porte de l'Outre Monde";
	}
	
	public void effect(Game game) {
		//Vous pouvez piocher une carte de la pile de votre choix
		int choosenStack = -1;
		while(choosenStack < 0 || choosenStack > 2) {
			System.out.println("Choose the card you want to draw :");
			System.out.println(" VISION : 0\n DARKNESS : 1\n LIGHT : 2\n\n");
			choosenStack = game.prompt();
		}
		switch(choosenStack) {
			case 0 : game.playVisionCard(); break;
			case 1 : game.playDarknessCard(); break;
			case 2 : game.playLightCard(); break;
			default : break;
		}
	}

}
