import java.util.TreeMap;

public class CopyTreeMap {

	public static void main(String[] args) {
		
		TreeMap<String ,String>map= new TreeMap<>();
		
		 map.put("C1", "Red");
	     map.put("C2", "White");
	     map.put("C3", "Blue");
	     map.put("C4", "Black");
	     map.put("C5", "Green");
	     
	     TreeMap<String ,String>map2= new TreeMap<>();
	     
	     map2.put("A1", "Orange");
	     map2.put("A2", "Pink");
	     
	     System.out.println("Map1 :"+map);
	     
	     System.out.println("Map2 :"+map2);
	    
	     map.putAll(map2);
	     
	     System.out.println("After coping map2 to map1:"+map);

	}

}
