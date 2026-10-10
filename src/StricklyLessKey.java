import java.util.TreeMap;

public class StricklyLessKey {

	public static void main(String[] args) {
		
		TreeMap<Integer ,String>map= new TreeMap<>();
		
		 map.put(10, "Red");
	     map.put(20, "White");
	     map.put(40, "Blue");
	     map.put(50, "Black");
	     map.put(60, "Green");
	     
	     System.out.println(map);
	     
	     System.out.println("Checking the entry for 10:");
	     System.out.println("Value is:"+map.lowerEntry(10));
	     
	     System.out.println("Checking the entry for 20:");
	     System.out.println("Value is:"+map.lowerEntry(20));
	     
	     System.out.println("Checking the entry for 70:");
	     System.out.println("Value is:"+map.lowerEntry(70));

	}

}
