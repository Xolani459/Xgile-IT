import java.util.*;
import java.util.Map.Entry;
public class Q2 {
    public static void main(String args[]) {

        TreeMap <String,String> tree_map1 = new TreeMap <String,String> ();

        tree_map1.put("C2", "Element2");
        tree_map1.put("C1", "Element1");
        tree_map1.put("C4", "Element4");
        tree_map1.put("C3", "Element3");

        System.out.println("Orginal TreeMap content: " + tree_map1);
        System.out.println("Greatest key: " + tree_map1.firstKey());
        System.out.println("Least key: " + tree_map1.lastKey());
    }
}
