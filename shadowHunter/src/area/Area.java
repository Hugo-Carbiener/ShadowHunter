package area;

import java.util.ArrayList;
import java.util.List;

public abstract class Area {
	
	protected List<Integer> values;
	
	public Area() {
		this.values = new ArrayList<>();
	}
	
	public abstract void effect();
	
}
