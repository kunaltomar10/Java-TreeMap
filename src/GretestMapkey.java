import java.util.TreeMap;

public class GretestMapkey {

	public static void main(String[] args) {
		
		TreeMap<Integer ,String>map= new TreeMap<>();
		
		 map.put(10, "Red");
	     map.put(20, "White");
	     map.put(40, "Blue");
	     map.put(50, "Black");
	     map.put(60, "Green");
	     
	     System.out.println(map);
	     
	     System.out.println("Checking the entry for 10:");
	     System.out.println("Value is:"+map.floorKey(10));
	     
	     System.out.println("Checking the entry for 30:");
	     System.out.println("Value is:"+map.floorKey(30));
	     
	     System.out.println("Checking the entry for 70:");
	     System.out.println("Value is:"+map.floorKey(70));

	}

}
