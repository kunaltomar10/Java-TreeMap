
import java.util.TreeMap;

public class P19 {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(10, "Red");
        map.put(20, "Green");
        map.put(30, "Black");
        map.put(40, "White");
        map.put(50, "Pink");

        System.out.println("Original TreeMap content: " + map);

        System.out.println("Sub map key-values: " + map.subMap(20, 40));
    }
}

