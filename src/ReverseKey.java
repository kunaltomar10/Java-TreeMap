
import java.util.TreeMap;

public class ReverseKey {

	public static void main(String[] args) {
		
		TreeMap<String ,String>map= new TreeMap<>();
		
		 map.put("C1", "Red");
	     map.put("C2", "White");
	     map.put("C3", "Blue");
	     map.put("C4", "Black");
	     
	     System.out.println("Map :"+map);
	     
	     System.out.println("Reverse order view of the keys: "+map.descendingKeySet());
	}

}
