import java.util.TreeMap;

public class ContainsValue {

	public static void main(String[] args) {
		
		TreeMap<String ,String>map= new TreeMap<>();
		
		 map.put("C1", "Red");
	     map.put("C2", "White");
	     map.put("C3", "Blue");
	     map.put("C4", "Black");
	     
	     
	     System.out.println("Map :"+map);
	     
	     if(map.containsValue("Red")){
	    	 System.out.println("The Tree Map contains key Red");
	     }else{
	    	 System.out.println("The Tree Map does not contains key Red ");
	     }
	     
	     if(map.containsValue("pink")){
	    	 System.out.println("The Tree Map contains key Pink ");
	     }else{
	    	 System.out.println("The Tree Map does not contains key Pink ");
	     }
	     
	}

}
