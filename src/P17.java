import java.util.Map;
import java.util.TreeMap;

public class P17 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(10, "Red"); 
		map.put(20, "Green");
		map.put(40, "Black");
		map.put(50, "White"); 
		map.put(60, "Pink"); 
		
		System.out.println("Value before poll: " + map); 
		
		Map.Entry<Integer, String> entry = map.pollFirstEntry();
		
		System.out.println("Value returned: " + entry);
		System.out.println("Value after poll: " + map);

	}

}
