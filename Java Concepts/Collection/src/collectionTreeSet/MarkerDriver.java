package collectionTreeSet;

import java.util.TreeSet;

public class MarkerDriver {
	
	public static void main(String[] args) {
		
		TreeSet<Marker> set = new TreeSet<>();
		set.add(new Marker("RED", 15));
		set.add(new Marker("BLACK", 10));
		set.add(new Marker("GREEN", 20));
		set.add(new Marker("YELLOW", 12));
		set.add(new Marker("BLUE", 18));
		set.add(new Marker("ORANGE", 25));
		
		for(Marker ele : set)
		{
			System.out.println(ele);
		}

		
	}

}
