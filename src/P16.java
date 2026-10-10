import java.util.NavigableSet;
import java.util.TreeMap;

public class P16 {

	public static void main(String[] args) {

		TreeMap<Integer ,String>map= new TreeMap<>();
		
		 map.put(10, "Red");
	     map.put(20, "White");
	     map.put(40, "Blue");
	     map.put(50, "Black");
	     map.put(60, "Green");
	     
	     System.out.println("Orignal TreeMap :"+map);
	     
	     NavigableSet<Integer> keys = map.navigableKeySet(); 
	     
	     System.out.println("NavigableSet view of keys: " + keys);

	}

}
