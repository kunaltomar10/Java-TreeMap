import java.util.TreeMap;
import java.util.Map;

public class P20 {
    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(30, "Black");
        treeMap.put(40, "White");
        treeMap.put(50, "Pink");

        System.out.println("Original TreeMap content: " + treeMap);

        Map<Integer, String> subMap = treeMap.subMap(20, true, 40, true);

        System.out.println("Sub map key-values: " + subMap);
    }
}
