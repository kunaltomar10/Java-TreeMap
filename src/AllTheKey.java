import java.util.TreeMap;

public class AllTheKey {

	public static void main(String[] args) {
		
		TreeMap<String ,String>map= new TreeMap<>();
		
		 map.put("C1", "Red");
	     map.put("C2", "White");
	     map.put("C3", "Blue");
	     map.put("C4", "Black");
	     
	     
	     System.out.println("Map :"+map);
	     
	     for(String key:map.keySet())
	     {
	    	 System.out.println(key);
	     }
	     

	}

}
