import java.util.TreeMap;

public class ContainsKey {

	public static void main(String[] args) {
		
		TreeMap<String ,String>map= new TreeMap<>();
		
		 map.put("C1", "Red");
	     map.put("C2", "White");
	     map.put("C3", "Blue");
	     map.put("C4", "Black");
	     
	     
	     System.out.println("Map :"+map);
	     
	     if(map.containsKey("C1")){
	    	 System.out.println("The Tree Map contains key C1 ");
	     }else{
	    	 System.out.println("The Tree Map does not contains key C1 ");
	     }
	     
	     if(map.containsKey("C5")){
	    	 System.out.println("The Tree Map contains key C5 ");
	     }else{
	    	 System.out.println("The Tree Map does not contains key C5 ");
	     }
	     
	}

}
