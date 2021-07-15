package area;

import java.util.ArrayList;
import java.util.List;

import controller.Game;

public abstract class Area {
	
	protected List<Integer> values;
	protected String name;
	
	public Area() {
		this.values = new ArrayList<>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public List<Integer> getValues() {
		return this.values;
	}
	
	public abstract void effect(Game game);
	
}
