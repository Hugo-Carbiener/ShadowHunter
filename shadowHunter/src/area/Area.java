package area;

import java.util.ArrayList;
import java.util.List;

public abstract class Area {
	
	protected List<Integer> values;
	protected String name;
	
	public Area() {
		this.values = new ArrayList<>();
	}
	
	public List<Integer> getValues(){
		return values;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void effect();
	
}
