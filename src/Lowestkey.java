
import java.util.TreeMap;

public class Lowestkey {

	public static void main(String[] args) {
		
		TreeMap<String ,String>map= new TreeMap<>();
		
		 map.put("C1", "Red");
	     map.put("C2", "White");
	     map.put("C3", "Blue");
	     map.put("C4", "Black");
	     
	     System.out.println("Map :"+map);
	     
	     System.out.println("Lowest Key :"+map.firstKey());
	     
	     System.out.println("Gretest Key :"+map.lastKey());
	     
	     

	}

}