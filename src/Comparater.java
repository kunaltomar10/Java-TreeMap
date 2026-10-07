import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Comparater {

	public static void main(String[] args) {
		
		TreeMap<String ,String>map= new TreeMap<>(Comparator.reverseOrder());
		
		 map.put("C1", "Red");
	     map.put("C2", "White");
	     map.put("C3", "Blue");
	     map.put("C4", "Black");
	     
	     for(Map.Entry<String, String> entry:map.entrySet()){
	    	 System.out.println(entry.getKey()+" "+entry.getValue());
	    	 
	     }
	     

	}

}
